package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	//Locator of the web-elements on landing page of amazon
	//private WebElement mobiles = driver.findElement(By.linkText("Mobile));
	//mobiles.click();
	
	private Actions actions;
	private WebDriverWait wait;
	
@FindBy(linkText = "Mobiles")
private WebElement mobiles;

@FindBy(id = "nav-link-accountList")
private WebElement signInMenu;

@FindBy(linkText = "Sign in")
private WebElement signInBtn;

@FindBy(id = "twotabsearchtextbox")
private WebElement searchBox;

@FindBy(xpath = "//div[contains(@class,'autocomplete-results-container')]")
private WebElement autoCompleteBox;

public LandingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}

public void clickMobiles() {
	mobiles.click();
}

public void hoverOverHelloSignInMenu() throws InterruptedException {
	actions.moveToElement(signInMenu).build().perform();
}

public void clickSignInBtn() {
	signInBtn.click();
}

public void searchItem(String item) {
	searchBox.sendKeys(item);
	wait.until(ExpectedConditions.visibilityOfAllElements(autoCompleteBox));
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
}
}
