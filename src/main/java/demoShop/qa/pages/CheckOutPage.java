package demoShop.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demoShopes.qa.util.SelectUtil;
import demoShopes.qa.util.WaitUtil;

public class CheckOutPage {
	
	private WebDriver driver;
	private By BillingNewAddressCountryIddropdown = By.id("BillingNewAddress_CountryId");
	private By BillingNewAddressCitytf = By.id("BillingNewAddress_City");
	private By BillingNewAddressAddress1tf = By.id("BillingNewAddress_Address1");
	private By BillingNewAddressZipPostalCodetf = By.id("BillingNewAddress_ZipPostalCode");
	private By BillingNewAddressPhoneNumbertf = By.id("BillingNewAddress_PhoneNumber");
	private By continuebtBilling = By.xpath("//input[@onclick='Billing.save()']");
	private By continuebtShipping = By.xpath("//input[@onclick='Shipping.save()']");
	private By continueShippingmethod = By.xpath("//input[@onclick='ShippingMethod.save()']");
	private By COD = By.xpath("//input[@value='Payments.CashOnDelivery']");
	private By continuePaymentMethod = By.xpath("//input[@onclick='PaymentMethod.save()']");
	private By continuePaymentInfo = By.xpath("//input[@onclick='PaymentInfo.save()']");
	private By continueConfirmOrder = By.xpath("//input[@onclick='ConfirmOrder.save()']"); 
	private By successMsg = By.xpath("//div[@class='title']/strong");
	
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void BillingAddressDetails(String dropdown, String BillingNewAddressCityvalue, String BillingNewAddressAddress1value,
			String BillingNewAddressZipPostalCodevalue,String BillingNewAddressPhoneNumbervalue)
	{
		SelectUtil.selectByVisibleText(BillingNewAddressCountryIddropdown, dropdown);
		WaitUtil.checkElementVisibile(BillingNewAddressCitytf).sendKeys(BillingNewAddressCityvalue);
		WaitUtil.checkElementVisibile(BillingNewAddressAddress1tf).sendKeys(BillingNewAddressAddress1value);
		WaitUtil.checkElementVisibile(BillingNewAddressZipPostalCodetf).sendKeys(BillingNewAddressZipPostalCodevalue);
		WaitUtil.checkElementVisibile(BillingNewAddressPhoneNumbertf).sendKeys(BillingNewAddressPhoneNumbervalue);
		WaitUtil.checkElementVisibile(continuebtBilling).click();
		
	}
	
	public void ShippingAddressDetails()
	{
		WaitUtil.checkElementVisibile(continuebtShipping).click();
	}
	
	public void ShippingMethodDetails()
	{
		WaitUtil.checkElementVisibile(continueShippingmethod).click();
	}
	
	public void paymentMethodDetails()
	{
		//WaitUtil.checkElementVisibile(COD).click();
		WaitUtil.checkElementVisibile(continuePaymentMethod).click();
	}
	public void continuePaymentInfoDetails()
	{
		WaitUtil.checkElementVisibile(continuePaymentInfo).click();
	}
	public void continueConfirmOrderDetails()
	{
		WaitUtil.checkElementVisibile(continueConfirmOrder).click();
	}
	public String getSucessMsg()
	{
		return WaitUtil.checkElementVisibile(successMsg).getText();
	}
	

}
