package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickHomeButton {

	@FindBy(linkText="Home")
	private WebElement homeButton;
	
	
	public ClickHomeButton(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnHomeButton(){
		homeButton.click();
	}
	
}
