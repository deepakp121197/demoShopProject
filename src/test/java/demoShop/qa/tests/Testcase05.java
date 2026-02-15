package demoShop.qa.tests;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import demoShop.qa.pages.Homepage;
import demoShop.qa.pages.Registerpage;
import demoShopes.qa.util.AllureUtil;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import listener.RetryAnalyzer;

@Epic("Demo Shop")
@Feature("Order a Product")
public class Testcase05 extends BaseTest{
	
	private static Logger log = LogManager.getLogger(OrderWithoutDataDriven.class);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Register a user")
	@Step("Register user all valid details")
	public void registerUser05(){
		
		String email = "test12"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		log.info("---Registration page testcase05---");
		AllureUtil.attachLog("Registering the user :"+email);
		Registerpage rp = new Registerpage(driver);
		rp.register("M","Firstname", "lastnames", email,"admin@1234", "admin@1234");
		String ER = "Your registration completed";
		String AR = rp.getSucessRegistermsg();
		Assert.assertEquals(ER, AR);
		//Assert.fail();
		System.out.println("Registration complete");
	}

}
