package demoShop.qa.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseTest;
import demoShop.qa.pages.BooksPage;
import demoShop.qa.pages.CheckOutPage;
import demoShop.qa.pages.Homepage;
import demoShop.qa.pages.Registerpage;
import demoShop.qa.pages.ShoppingCartPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

@Epic("Demo Shop")
@Feature("Order a Product")

public class OrderWithoutDataDriven extends BaseTest {
	
	
	private static Logger log = LogManager.getLogger(OrderWithoutDataDriven.class);
	
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Register and order products")
	@Step("Register and order a product with all valid details")
	
	public void orderbook() throws InterruptedException
	{
		log.info("TestCase Started");
		Homepage hp = new Homepage(driver);
		Registerpage rp = new Registerpage(driver);
		BooksPage bkp = new BooksPage(driver);
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		CheckOutPage cp = new CheckOutPage(driver);
		
		hp.clickRegisterButton();
	
		rp.register("M","Firstname", "lastnames", "tyqad6yu78u688765595@gmail.com","admin@1234", "admin@1234");
		
		String RER = "Your registration completed";
		String RAR = rp.getSucessRegistermsg();
		Assert.assertEquals(RER, RAR);
		log.info("Registration complete");
		hp.clickBooksButton();
		
		bkp.clickFirstAddtoCart();
		log.info("Products added to cart");
		hp.clickShoppingCartButton();
	    scp.ShoppingCartPageDetail("India");
		cp.BillingAddressDetails("India", "Bangalore", "raghavendra", "98765", "9876543212");
		log.info("Billing details entered sucessfully");
		cp.ShippingAddressDetails();
		cp.ShippingMethodDetails();
		log.info("Shipping details entered successfully");
		cp.paymentMethodDetails();
		cp.paymentMethodDetails();
		cp.continuePaymentInfoDetails();
		log.info("payment details confirmed");
		cp.continueConfirmOrderDetails();
		String AR = cp.getSucessMsg().trim();
		String ER = "Your order has been successfully processed!";
		Assert.assertEquals(AR, ER);
		log.info("Order placed");
		
		
		
	}

}
