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

public class MultipleTestCases extends BaseTest {
	
private static Logger log = LogManager.getLogger(MultipleTestCases.class);
	
	@Test
	@Feature("Order a Product")
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
	
		rp.register("M","Firstname", "lastnames", "yoiuy5678u688765595zz@gmail.com","admin@1234", "admin@1234");
		
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
		@Test
		@Feature("Register a user")
		@Severity(SeverityLevel.CRITICAL)
		@Description("Register a user")
		@Step("Register user all valid details")
		public void registerUser(){
			
			Homepage hp = new Homepage(driver);
			hp.clickRegisterButton();
			Registerpage rp = new Registerpage(driver);
			rp.register("M","Firstname", "lastnames", "jk78dmin12334@gmail.com","admin@1234", "admin@1234");
			String ER = "Your registration completed";
			String AR = rp.getSucessRegistermsg();
			Assert.assertEquals(ER, AR);
			System.out.println("Registration complete");
		
		
		
		
	}

}
