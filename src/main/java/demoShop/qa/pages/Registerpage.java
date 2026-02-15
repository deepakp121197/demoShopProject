package demoShop.qa.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demoShopes.qa.util.WaitUtil;

public class Registerpage {
	
	private WebDriver driver;
	
     private By g_male = By.id("gender-male");
     private By g_female = By.id("gender-female");
     private By firstname = By.id("FirstName");
     private By lastname = By.id("LastName");
     private By email = By.id("Email");
     private By password = By.id("Password");
     private By ConfirmPassword = By.id("ConfirmPassword");
     private By registerbutton = By.id("register-button");
     private By registermsg = By.xpath("//div[@class='result']");
     private By errorMsgFirstName= By.xpath("//span[@data-valmsg-for='FirstName']");
     private By errorMsgConfirmPassword= By.xpath("//span[@data-valmsg-for='ConfirmPassword']");
     
	 
     
     public Registerpage(WebDriver driver)
     {
    	this.driver=driver;
     }
     
     public void clickMale_rb()
     {
    	 WaitUtil.checkElementVisibile(g_male).click();
     }
     public void clickFemale_rb()
     {
    	 WaitUtil.checkElementVisibile(g_female).click();
     }
     public void enterFirstname(String text)
     {
    	 WaitUtil.checkElementVisibile(firstname).sendKeys(text);
     }
     public void enterLastname(String text)
     {
    	 WaitUtil.checkElementVisibile(lastname).sendKeys(text);
     }
     public void enterEmail(String text)
     {
    	 WaitUtil.checkElementVisibile(email).sendKeys(text);
     }
     public void enterPassword(String text)
     {
    	 WaitUtil.checkElementVisibile(password).sendKeys(text);
     }
     public void enterConfirmpassword(String text)
     {
    	 WaitUtil.checkElementVisibile(ConfirmPassword).sendKeys(text);
     }
     public void clickRegister_bt()
     {
    	 WaitUtil.checkElementVisibile(registerbutton).click();
    	 
     }
     public String getSucessRegistermsg()
     {
    	 return WaitUtil.checkElementVisibile(registermsg).getText();
     }
     public void register(String gender,String firstname, String lastname, String email, String password,String confirmpassword)
     {
    	 if(gender == "M")
    	 {
    	 clickMale_rb();
    	 }
    	 else
    	 {
    		 clickFemale_rb();
    	 }
    	 enterFirstname(firstname);
    	 enterLastname(lastname);
    	 enterEmail(email);
    	 enterPassword(password);
    	 enterConfirmpassword(confirmpassword);
    	 clickRegister_bt();
     }

     public String getpageTitle()
     {
    	 return driver.getTitle();
     }
     
     public  String geterrormsgFirstName()
     {
    	 return WaitUtil.checkElementVisibile(errorMsgFirstName).getText();
     }
     public  String geterrormsgConfirmPass()
     {
    	 return WaitUtil.checkElementVisibile(errorMsgConfirmPassword).getText();
     }
}
