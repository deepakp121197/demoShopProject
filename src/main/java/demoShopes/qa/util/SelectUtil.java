package demoShopes.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class SelectUtil {
	
	public static Select getSelect(By locator)
	{
		WebElement dropdown = WaitUtil.checkElementVisibile(locator);
		return new Select(dropdown);
	}

	public static void selectByVisibleText(By locator, String text)
	{
		getSelect(locator).selectByVisibleText(text);
	}
	
	public static void selectByIndex(By locator, int index)
	{
		getSelect(locator).selectByIndex(index);
	}
	
	public static void deselectByVisibleText(By locator, String text)
	{
		getSelect(locator).deselectByVisibleText(text);
	}
	
	public static void deselectByIndex(By locator, int index)
	{
		getSelect(locator).deselectByIndex(index);
	}
	
	public static List<WebElement> fetchAllOptions(By locator) {
		return getSelect(locator).getOptions();
	}
}

