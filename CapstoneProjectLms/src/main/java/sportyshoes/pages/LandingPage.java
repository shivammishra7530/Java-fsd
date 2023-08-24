package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {


	@FindBy(linkText="New User? Register Here")
	private WebElement register;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegister(){
		register.click();
	}
	
}
