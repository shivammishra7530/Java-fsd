package SeleniumDemo;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {
	public static void main(String[] args) {
		//1)Open the browser
		ChromeDriver driver = new ChromeDriver();
		
    //2)Maximize it
	driver.manage().window().maximize();
		
		//3)Navigate to the application
		driver.get("https://www.facebook.com/");
		
		//Click on 'Instagram'
		driver.findElement(By.linkText("Instagram")).click();
		
		//5) Switch focus on new tab
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		
		//Wait for the next page to load completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		
		//6)Write 'usernameinvalid124hd4@gmail.com' in the email textbox of Instagram page
		driver.findElement(By.name("username")).sendKeys("usernameinvalid124hd4@gmail.com");
	}
	
}
