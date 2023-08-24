package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[contains(@class,\"btn btn-primary\")]")
	private WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickEnterEmail(){
		enterEmail.sendKeys("Shawn1212312@gmail.com");
	}
	
	public void clickEnterPassword(){
		enterPassword.sendKeys("Shawn1212312");
	}
	
	public void clickLogin(){
		login.click();
	}
}
