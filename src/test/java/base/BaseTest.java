package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import demoShopes.qa.util.ReadProperty;
import driver.DriverFactory;

public class BaseTest {
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(@Optional String browser) throws IOException
	{
       if(browser==null)
       {
    	  browser=ReadProperty.getProperty("browser");
       }
       boolean headless = Boolean.parseBoolean(ReadProperty.getProperty("headless"))  ;
       DriverFactory.initDriver(browser,headless);

       driver = DriverFactory.getDriver();
       DriverFactory.getDriver().manage().window().maximize();
       DriverFactory.getDriver().get(ReadProperty.getProperty("url"));
       
	}
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitBrowser();
	}

}
