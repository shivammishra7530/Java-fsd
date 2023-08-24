package sportyshoes.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sportyshoes.pages.AddToCart;
import sportyshoes.pages.Cart;
import sportyshoes.pages.ClickHomeButton;
import sportyshoes.pages.LandingPage;
import sportyshoes.pages.LoginPage;
import sportyshoes.pages.Logout;
import sportyshoes.pages.RegisterUser;
import sportyshoes.pages.VerifyText;



public class AutomateSportyShoes {

	
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() throws InterruptedException{
		
		driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://localhost:9010");
			}
	
	@Test
	public void performTest() throws InterruptedException{
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickRegister();
		
		RegisterUser registerUser = new RegisterUser(driver);
		registerUser.clickEnterName();
		registerUser.clickEnterEmail();
		registerUser.clickEnterPassword();
		registerUser.clickRegisterButton();
		
		Logout logout = new Logout(driver);
		logout.clickLogout();
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickEnterEmail();
		loginPage.clickEnterPassword();
		loginPage.clickLogin();
		Thread.sleep(2000);
		
		
		AddToCart addToCart = new AddToCart(driver);
		Thread.sleep(2000);
		addToCart.addtoCart();
		
		ClickHomeButton clickHomeButton = new ClickHomeButton(driver);
		clickHomeButton.ClickOnHomeButton();
		
		Cart cart = new Cart(driver);
		cart.ClickCart();
		
		VerifyText verifyText = new VerifyText(driver);
		String expectedText = verifyText.doVerifyText();
		String actualText = "Step Up Your Game with Sporty Shoes: Where Every Click is a Stride Towards Style!";
		Assert.assertEquals(expectedText, actualText);
		
		
}       
	
	@AfterTest
	public void closeBrowser() {
		//driver.quit();
	}
}
