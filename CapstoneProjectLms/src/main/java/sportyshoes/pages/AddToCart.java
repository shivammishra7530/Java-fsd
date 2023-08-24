package sportyshoes.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
  
  @FindBy(xpath  = "(//a[contains(@class,'btn-primary')])[1]")
  private WebElement FirstItem;
  

  
JavascriptExecutor js;
WebDriverWait wait;
Actions actions ;

  
  public AddToCart(WebDriver driver)
  {
    js = (JavascriptExecutor) driver;
    PageFactory.initElements(driver, this);
     actions = new Actions(driver);
     wait = new WebDriverWait(driver, Duration.ofSeconds(60));
  }
  
  public void addtoCart() throws InterruptedException {
    Thread.sleep(2000);
    js.executeScript("arguments[0].scrollIntoView()",FirstItem );
    js.executeScript("arguments[0].click()", FirstItem);
    
  }
//  public void addSecondItem()
//  {
//    actions.moveToElement(SecItem).click().perform();
//  }
  
  //public void ClickLogoutBtn()
  //{
  //  logoutBtn.click();
  //}
}