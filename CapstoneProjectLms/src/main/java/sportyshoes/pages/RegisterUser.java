package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {


	@FindBy(id="name")
	private WebElement enterName;
	
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[contains(@type,\"submit\")]")
	private WebElement registerButton;
	
	
	public RegisterUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickEnterName(){
		enterName.sendKeys("Shawn");
	}
	
	public void clickEnterEmail(){
		enterEmail.sendKeys("Shawn1212312@gmail.com");
	}
	
	public void clickEnterPassword(){
		enterPassword.sendKeys("Shawn1212312");
	}
	
	public void clickRegisterButton(){
		registerButton.click();
	}
	
	
}
