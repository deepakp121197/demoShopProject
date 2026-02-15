package demoShop.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demoShopes.qa.util.WaitUtil;

public class Homepage {
	
	private WebDriver driver;
	private By register = By.xpath("//a[@class='ico-register']");
	private By Books = By.xpath("(//a[contains(.,'Books')])[1]");
	private By Shoppingcart = By.xpath("//span[.='Shopping cart']");
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickRegisterButton()
	{
		WaitUtil.checkElementVisibile(register).click();
	}
	
	public void clickBooksButton()
	{
		WaitUtil.checkElementVisibile(Books).click();
	}
	public void clickShoppingCartButton()
	{
		WaitUtil.checkElementVisibile(Shoppingcart).click();
	}
}
