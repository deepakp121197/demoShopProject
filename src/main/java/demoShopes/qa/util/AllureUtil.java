package demoShopes.qa.util;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.DriverFactory;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class AllureUtil {
	
	//not working -- byte type is not attaching in report
	@Attachment(value="Failed Screen shot", type="image/png")
	public static byte[] attachScreenshots()
	{
		
		//if (driver == null) {
	      //  System.out.println("Driver is null. Screenshot not captured.");
	       // return new byte[0];
	    //}
		TakesScreenshot ts = (TakesScreenshot)DriverFactory.getDriver();
		return ts.getScreenshotAs(OutputType.BYTES);
	}

	//working
	public static void attachScreenshot() {
	 
	        
	  byte[] ts = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	  Allure.addAttachment("failed screenshot", new ByteArrayInputStream(ts));
	}
	
	public static void attachLog(String log) {
	    Allure.addAttachment("Execution log", new String(log));;
	}
}
