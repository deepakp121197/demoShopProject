package demoShop.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import demoShopes.qa.util.SelectUtil;
import demoShopes.qa.util.WaitUtil;

public class ShoppingCartPage {
	
	private WebDriver driver;
	private By countryDropdown = By.id("CountryId");
	private By estimateShipping = By.xpath("//input[@name='estimateshipping']");
	private By termsofservice_cb = By.id("termsofservice");
	private By checkout_bt = By.id("checkout");
	
	
	public  ShoppingCartPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void selectcountryDropdown(String text)
	{
		SelectUtil.selectByVisibleText(countryDropdown, text);
	}
	public void clickestimateShipping()
	{
		WaitUtil.checkElementVisibile(estimateShipping).click();
	}
	public void termsofservice_cb()
	{
		WaitUtil.checkElementVisibile(termsofservice_cb).click();;
	}
	
	public void checkout_bt()
	{
		WaitUtil.checkElementVisibile(checkout_bt).click();
	}
	public void ShoppingCartPageDetail(String dropdown)
	{
		selectcountryDropdown(dropdown);
		clickestimateShipping();
		termsofservice_cb();
		checkout_bt();
	}
	

}
