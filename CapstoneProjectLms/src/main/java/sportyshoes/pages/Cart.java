package sportyshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	@FindBy(linkText="Cart")
	private WebElement cart;
	
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCart(){
		cart.click();
	}
	
}
