package ExcelDrive;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import Library.ExcelDataConfig;
import Library.ExcelUtility;
import Library.ExcelUtilityForMultiple;
import Library.ExcelDataConfig;
public class LoginLogoutExcel {
	public static WebDriver driver;


	public static void main(String[] args) throws IOException {
		
	
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.freecrm.com");
	
	//String uname=ExcelUtility.getCellData("Sheet1", 0, 0);
		//String pwd=ExcelUtility.getCellData("Sheet1", 0, 1);
	//String uname=ExcelUtilityForMultiple.getMultipleCellData("Sheet2", 0, 1);
	//String pwd=ExcelUtilityForMultiple.getMultipleCellData("Sheet2", 0, 1);
	ExcelDataConfig excelconfig=new ExcelDataConfig("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
	
	System.out.println(excelconfig.getData(0, 0, 1));
	String uname=excelconfig.getData(1, 0, 0);
	String pwd=excelconfig.getData(1,0, 1);
	
	
	
		
		
		
			driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
	


