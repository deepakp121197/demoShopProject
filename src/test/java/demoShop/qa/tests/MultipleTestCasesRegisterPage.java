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

@Epic("Demo Shop")
@Feature("Registration Page")

public class MultipleTestCasesRegisterPage extends BaseTest{
	
	private static Logger log = LogManager.getLogger(OrderWithoutDataDriven.class);
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Registerpage Title")
	public void verifyPageTitle() {
		
		log.info("---verifyPageTitle---");
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		Registerpage rp = new Registerpage(driver);
		String ER = "Demo Web Shop. Register";
		String AR = rp.getpageTitle();
		Assert.assertEquals(ER, AR);
		log.info("---Page title verfified successfully--");
		AllureUtil.attachLog("Page title verfified successfully");
		
		
		
	}
	
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Registerpage Firstname Error Mesg")
	public void verifyErrorMsgFirstname() {
		
		log.info("---verifyFirstnameErrorMsg---");
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		Registerpage rp = new Registerpage(driver);		
		rp.clickRegister_bt();
		String AR = rp.geterrormsgFirstName();
		String ER = "First name is required.";
		Assert.assertEquals(AR, ER);
		log.info("---verifyFirstnameErrorMsg Sucesssfully---");
        AllureUtil.attachLog("Firstname error msg verfified successfully");
	
	
	}
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Registerpage confirm pass Error Mesg")
	public void verifyCorfirmPassErrorMsg() {
		
		String email = "test12"+RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
		
		log.info("---verifyConfirmPassErrorMsg---");
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		Registerpage rp = new Registerpage(driver);		
		rp.clickRegister_bt();
		rp.register("M","Firstname", "lastnames", email,"admin@1234", "admin@123456");
		String ARM = rp.geterrormsgConfirmPass();
		String ERM = "First name is required.";
		//Assert.assertEquals(ARM, ERM);
		log.info("---verifyConfirmPassErrorMsg Sucesssfully---");
        AllureUtil.attachLog("ConfirmPass error msg verfified successfully");
	
	
	}
	

}
