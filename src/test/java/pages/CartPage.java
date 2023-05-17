package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase{
	
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement viewcart;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/a[1]")
	WebElement deleteItem;
	
	@FindBy(xpath="//a[@id='logout2']")
	WebElement logout;
		
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void viewCart() 
	{
	 	 
	  viewcart.click();
    }
	
	public void deleteProd() {
		deleteItem.click();
	}
	
	
	
	public void logout()
	{
		logout.click();
	}

}
