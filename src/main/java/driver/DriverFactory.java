package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> tDriver = new ThreadLocal<WebDriver>();
	
	public static void initDriver(String browser, Boolean headless)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			if(headless == true) {
			options.addArguments("--headless");
			}
			tDriver.set(new ChromeDriver(options));
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			EdgeOptions options = new EdgeOptions();
			if(headless == true) {
			options.addArguments("--headless");
			}
			tDriver.set(new EdgeDriver(options));
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			if(headless == true) {
			options.addArguments("--headless");
			}
			tDriver.set(new FirefoxDriver(options));
		}
	}

	public static WebDriver getDriver()
	{
		return tDriver.get();
	}
	public static void quitBrowser()
	{
		getDriver().quit();
		tDriver.remove();
	}
}
