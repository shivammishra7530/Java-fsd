package phase1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTesting {
public static void main(String[] args) throws InterruptedException {
	//1)Open the browser
		ChromeDriver driver = new ChromeDriver();
		
	//2)Maximize it
	driver.manage().window().maximize();
	
		
		//3)Navigate to the application
		driver.get("https://www.amazon.in/");
		
		
		//Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobiles")));
			
		//Click on ‘Mobiles’ in the navigation bar
		driver.findElement(By.linkText("Mobiles")).click();
		
		
		//Hover the pointer over ‘Mobiles & Accessories’
		 WebElement mobilesAndAccessories = driver.findElement(By.linkText("Mobiles & Accessories"));
		 
		 
	     Actions actions = new Actions(driver);
	     actions.moveToElement(mobilesAndAccessories).build().perform();
	     
	     WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobiles & Accessories")));
			
			
			//Click on ‘Apple’ in the sub-menu
			driver.findElement(By.linkText("Apple")).click();
			
			
			//Thread.sleep(2000);
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'s-image')])[1]")));

			
			
			//Click on first available phone.
	         driver.findElement(By.xpath("(//div[contains(@class,'s-image')])[1]")).click();
				
	         
			
			//Thread.sleep(2000);
			//Switching to the new tab
			 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
			    
			    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy-now-button")));
				
			//Click on Buy now button
			driver.findElement(By.id("buy-now-button")).click();
			
			//Enter email-id for login
			driver.findElement(By.id("ap_email")).sendKeys("invalidusername234abc@gmail.com");
			
			//Click on continue button
			driver.findElement(By.id("continue")).click();
			
			//Verifying error message
			String ExpectedMessage = "We cannot find an account with that email address";
			String ActualMessage = driver.findElement(By.xpath("//span[contains(@class,'a-list-item')]")).getText();
			
			if(ExpectedMessage.equals(ActualMessage)) {
				System.out.println("Test is done successfully!");
			}
			else {
				System.out.println("Test case Failed!");
			}
			
			
			//Close the browser
			//driver.quit();
}
}
