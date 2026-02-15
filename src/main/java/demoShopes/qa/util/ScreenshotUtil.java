package demoShopes.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {
	
	public static void captureScreenshot(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./src/test/resources/Screenshot/"+name+".png");
		FileHandler.copy(temp, perm);
	}

}
