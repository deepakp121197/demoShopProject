package demoShop.qa.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import demoShop.qa.pages.Homepage;
import demoShop.qa.pages.Registerpage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import listener.AllureListeners;


//@Listeners(AllureListeners.class)
@Epic("Demo Shop")
@Feature("Order a Product")
public class Testcase04 extends BaseTest{
	
	private static Logger log = LogManager.getLogger(OrderWithoutDataDriven.class);
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Register a user")
	@Step("Register user all valid details")
	public void registerUser(){
		
		log.info("TestCase Started");
		
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		Registerpage rp = new Registerpage(driver);
		rp.register("M","Firstname", "lastnames", "ertab7dd8996dmin12b8774zzxcggg@gmail.com","admin@1234", "admin@1234");
		String ER = "Your registration ";
		System.out.println(driver);
		//Assert.fail();
		String AR = rp.getSucessRegistermsg();
		
		Assert.assertEquals(ER, AR);
		System.out.println("Registration complete");
	}

}
