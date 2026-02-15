package demoShop.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import demoShop.qa.pages.Homepage;
import demoShop.qa.pages.Registerpage;
import testdataprovider.ReadExcelData;


public class TestCase01 extends BaseTest{
	
	@Test(dataProvider = "registerdata", dataProviderClass = ReadExcelData.class)

	public void registerUser(String gender,String firstname, String lastname, String email, String password,String confirmpassword)
	{
		
		Homepage hp = new Homepage(driver);
		hp.clickRegisterButton();
		Registerpage rp = new Registerpage(driver);
		rp.register(gender,firstname, lastname, email, password, confirmpassword);
		String ER = "Your registration completed";
		String AR = rp.getSucessRegistermsg();
		Assert.assertEquals(ER, AR);
	}

}
