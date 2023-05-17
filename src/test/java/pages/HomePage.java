package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

import base.TestBase;

public class HomePage extends TestBase {
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement prodOneClick;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement prodOneAddCart;
	
	@FindBy(xpath="//a[contains(text(),'Sony vaio i7')]")
	WebElement prodTwoClick;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement prodTwoAddCart;
	
	
	@FindBy(linkText="Cart")
	WebElement viewcart;
	
	@FindBy(xpath="//a[@id='logout2']")
	WebElement logout;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
		}
	
	public void addProdOne() throws InterruptedException {	
		Thread.sleep(2000);
		prodOneClick.click();
		prodOneAddCart.click();
		Thread.sleep(2000);
		Alert alertone = driver.switchTo().alert();
		System.out.println("Adding Product One: " +alertone.getText());
		alertone.accept();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void addProdTwo() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(10, 500)","");
		prodTwoClick.click();
		prodTwoAddCart.click();
		Thread.sleep(2000);
		Alert alerttwo = driver.switchTo().alert();
		System.out.println("Adding Product Two: " +alerttwo.getText());
		alerttwo.accept();	
						
	}
	
	public void viewCart()
	{
	  viewcart.click();
    }
	
	public void logout()
	{
		logout.click();
	}
	
	
	

}
