package in.amazon.teststeps;


import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AddToCart;
import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Physics_LandingPage2;
import in.amazon.pages.ProceedToBuy;
import in.amazon.pages.SignIn;
import in.amazon.pages.VerifySignInPage;

public class Driver extends Tools{

	
	protected static LandingPage landingPage;
	protected static AllMobileBrands allMobileBrands;
	protected static ApplePhones applePhones;
	protected static BuyPhone buyPhone;
	protected static SignIn signIn;
	protected static Physics_LandingPage2 physics_LandingPage2;
	protected static AddToCart addToCart;
	protected static ProceedToBuy proceedToBuy;
	protected static VerifySignInPage verifySignInPage;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		landingPage = new LandingPage(driver);
		allMobileBrands = new AllMobileBrands(driver);
		 applePhones = new ApplePhones(driver);
		  buyPhone = new BuyPhone(driver);
		  signIn = new SignIn(driver);
		  physics_LandingPage2  = new Physics_LandingPage2(driver);
		  addToCart = new AddToCart(driver);
		  proceedToBuy = new ProceedToBuy(driver);
		  verifySignInPage = new VerifySignInPage(driver);
	}
	
}
