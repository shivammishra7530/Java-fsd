package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitDemo {
public static void main(String[] args) {
	//1)Open the browser
	ChromeDriver driver = new ChromeDriver();
	
	//2)Maximize the browser
	driver.manage().window().maximize();
	
	//3) Navigate the application
	driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	
	//4)Click on the Start button
	driver.findElement(By.id("start")).click();
	
	//Wit for the text to appear
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
	
	//5)Verify the text 'Hello World!' appears on the web page
	String expectedText = "Hello World!";
	String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
	
	if (expectedText.equals(actualText)){
		System.out.println("Test Case Passed");
	}
	else {
		System.out.println("Test Case Failed");
	}
	
	//Close the browser
	driver.quit();	}
}
