package in.amazon.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Physics_LandingPage2 {
      
	private Actions actions;
	
	@FindBy(xpath = "(//span[contains(@class,'a-size-small a-color-base')])[1]")
	private WebElement selectRating;
	
	@FindBy(xpath = "//i[contains(@class,'(//div[contains(@class,'sg-row')])[4]')]")
	private WebElement selectFirstBook;
	
	
	public Physics_LandingPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickSelectRating() {
		selectRating.click();
	}
	
	public void ClickSelectFirstBook() throws InterruptedException {
		Thread.sleep(1000);
		selectFirstBook.click();
	}
	
}
