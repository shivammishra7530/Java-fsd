package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyText {

	@FindBy(css="body > div:nth-child(2) > div > p:nth-child(3)")
	private WebElement verifyText;
	
	
	
	public VerifyText(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String doVerifyText(){
		return verifyText.getText();
	}
	
	
}
