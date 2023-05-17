package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//a[@id='login2']")
	WebElement loginbtn;
	
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement passwd;
		
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement clicklogin;
	
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		}
	
	
	public void clickLogin() {		
		loginbtn.click();
	}
	
	public void enterCredentials(String uname, String pwd ) {
		username.sendKeys(uname);
		passwd.sendKeys(pwd);
		clicklogin.click();
	}
	

}
