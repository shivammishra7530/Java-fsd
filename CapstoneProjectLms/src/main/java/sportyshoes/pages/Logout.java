package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(linkText="Logout")
	private WebElement logout;
	
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout(){
		logout.click();
	}
}
