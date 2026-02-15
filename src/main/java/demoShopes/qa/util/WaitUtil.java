package demoShopes.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import demo.qa.constants.ApplicationConstants;
import driver.DriverFactory;


public class WaitUtil implements ApplicationConstants{
	
	//private static WebDriver driver;
	//private static final int Timeout=10;
	
	public static WebElement checkElementVisibile(By locator)
	{
		return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(Timeout))
			   .until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
