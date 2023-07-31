package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	private Actions actions;

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCart;
	
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickAddToCart() {
		addToCart.click();
	}
	
}
