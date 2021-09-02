package ExcelDrive;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Library.ExcelDataConfig;

public class DataProviderWordPressLoginExcel {
	WebDriver driver;
	//File src= new File("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
	
	@Test(dataProvider="wordpressdata")
	public void loginToWordPress(String username, String password) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get(" https://www.freecrm.com");
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 WebElement loginBtn = null;
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", loginBtn);
		 Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown()
	{	
		System.out.println("login succesfully");
		//driver.quit();
	}
	
	@DataProvider(name="wordpressdata")
	public Object[] passdata()
	
	{
		ExcelDataConfig config=new ExcelDataConfig("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");
		int rows=config.getRowCount(0);
		
		Object[][]data=new Object[rows][2];
		for(int i=0; i<rows; i++)
		{
			data[i][0]=config.getData(1, i, 0); 
			data[i][1]=config.getData(1, i, 1); 
			
		}
		
		
		return data;
		
	}
	

}
