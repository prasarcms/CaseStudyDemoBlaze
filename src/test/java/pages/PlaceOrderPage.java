package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class PlaceOrderPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement viewcart;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOdrBtn;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement nametxt;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement countrytxt;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement citytxt;
	
	
	@FindBy(xpath="//input[@id='card']")
	WebElement cardtxt;
	
	
	@FindBy(xpath="//input[@id='month']")
	WebElement monthtxt;
	
	
	@FindBy(xpath="//input[@id='year']")
	WebElement yeartxt;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	WebElement placeOrderbtn;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement thankuclick;

	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okclick;

	@FindBy(id="logout2")
	WebElement logout;
	
	
	public PlaceOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void viewCart() throws InterruptedException
	{
     Thread.sleep(2000);	
	  viewcart.click();
    }
	
	public void clickPlaceOrder() {
		placeOdrBtn.click();
	}
	
	
	public void formFields(String nam, String cou, String cit,String crd, String mnt, String yr) throws InterruptedException {
		nametxt.sendKeys(nam);
		countrytxt.sendKeys(cou);
		citytxt.sendKeys(cit);
		cardtxt.sendKeys(crd);
		monthtxt.sendKeys(mnt);
		yeartxt.sendKeys(yr);
		//Thread.sleep(500);
		placeOrderbtn.click();
		
		
	}
	
	public void thankuAlert()
	{
	String act = thankuclick.getText();
	System.out.println("Message: "+ act);
	//Assert.assertEquals(act, "Thank you for your purchase!");
	}
	
	public void thkyouOkClick()
	{
		okclick.click();
	}

	public void logout()
	{
		logout.click();
	}
	

}
