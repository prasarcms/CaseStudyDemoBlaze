package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;	
	CartPage cartPage;
	PlaceOrderPage placeorderPage;
  @BeforeTest
  public void setup() {
	  initialize();  
  }	
	
  @Test(priority = 1)
  public void addItemsToCartTest() throws InterruptedException {
	  
	  loginPage = new LoginPage();
	  loginPage.clickLogin();
	  loginPage.enterCredentials("prasar", "Password@2");
	  
	  homePage = new HomePage();
	  homePage.addProdOne();
	  homePage.addProdTwo();
	  homePage.viewCart();
	  homePage.logout();
	  	  
  }
  
  @Test(priority = 2)
  public void deleteFromCartTest() throws InterruptedException {
	  loginPage = new LoginPage();
	  loginPage.clickLogin();
	  loginPage.enterCredentials("prasar", "Password@2");
	  
	  Thread.sleep(2000);
	  cartPage = new CartPage();
	  
	  Thread.sleep(2000);
	  cartPage.viewCart();
	  
	  Thread.sleep(2000);
	  cartPage.deleteProd();
	  cartPage.logout();
	  
  }
  
  @Test(priority = 3)
  public void PlacingOrderTest() throws InterruptedException {
	  Thread.sleep(2000);
	  loginPage = new LoginPage();
	  loginPage.clickLogin();
	  loginPage.enterCredentials("prasar", "Password@2");
	  
	  placeorderPage = new PlaceOrderPage();
	  Thread.sleep(2000);
	  placeorderPage.viewCart();
	  
	  Thread.sleep(2000);
	  placeorderPage.clickPlaceOrder();
	  placeorderPage.formFields("Prateek", "India", "Bengaluru", "5566204900063606", "08", "2024");
	  
	  Thread.sleep(2000);
	  placeorderPage.thankuAlert();
	  
	  Thread.sleep(2000);
	  placeorderPage.thkyouOkClick();
	  
	  Thread.sleep(2000);
	  placeorderPage.logout();
  }
  
  
  
  
  
  @AfterTest
  public void tearDown() {
	  closeBrowser();
  }
  
}
