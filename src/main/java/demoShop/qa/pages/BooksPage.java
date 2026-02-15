package demoShop.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demoShopes.qa.util.WaitUtil;

public class BooksPage {
	
    private	WebDriver driver;
    private By first_AddtoCart = By.xpath("(//input[@value='Add to cart'])[1]");
    
    
	
	public BooksPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickFirstAddtoCart()
	{
		WaitUtil.checkElementVisibile(first_AddtoCart).click();
	}

}
