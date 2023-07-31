package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySignInPage {
	private Actions actions;

	@FindBy(xpath = "//h1[contains(@class,'a-spacing-small')]")
	private WebElement verifySignIn;
	
	
	public VerifySignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public String DoVerifySignIn(){
		return verifySignIn.getText();
	}
	
}
