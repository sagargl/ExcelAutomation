package DataProviderWithDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbdayTest {
	WebDriver driver;
	  static XSSFWorkbook workbook;
	   static XSSFSheet sheet;
	    XSSFCell cell;
	
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 //driver.manage().timeouts().implicitlyWait(time, unit)
		
		 
	}
	
	@DataProvider
	public static Object[][] getTestData(XSSFSheet sheet) throws IOException
	
	{
		File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook work=new XSSFWorkbook(file);
		XSSFSheet sheet1=work.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total rows"+rowcount);
		
		for(int i=0; i<rowcount; i++)
		{
		String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Testdata from excel is "+data);
		
		System.out.println();
		}
		return null;
		
	}
}