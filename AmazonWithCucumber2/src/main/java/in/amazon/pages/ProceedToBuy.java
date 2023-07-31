package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToBuy {
	
	private Actions actions;

	@FindBy(xpath = "//span[contains(@class,'a-size-medium-plus a-color-base sw-atc-text a-text-bold')]")
	private WebElement verifyText;
	
	@FindBy(xpath = "//input[contains(@name,'proceedToRetailCheckout')]')]")
	private WebElement proceedToBuy;
	
	
	public ProceedToBuy(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public String doVerifyText(){
		return verifyText.getText();
	}
	
	public void clickProceedToBuy() {
		proceedToBuy.click();
	}
	
}
