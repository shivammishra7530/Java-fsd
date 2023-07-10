// how elements are located using Selenium WebDriver.


// Using ID as a Locator
// Using class name as a Locator
// Using name as a Locator
// Using Link Text as a Locator
// Using Xpath as a Locator 
// Using CSS Selector as a Locator
// Using XPath for handling complex and dynamic elements

//Below is the example of an ID and xpath Locator


package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
public static void main(String[] args) {
	//Open the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Navigate to the application
	driver.get("https://www.facebook.com/");
	
	//Enter invalid username 'invalidusername234abc@gmail.com' in the email or phone number box 
	driver.findElement(By.id("email")).sendKeys("invalidusername234abc@gmail.com");
	
	//Enter invalid Password 'invalidPassword@123' in the 'password' box.
	driver.findElement(By.id("pass")).sendKeys("invalidPassword@123");
	
	//Click Login Button
	driver.findElement(By.name("login")).click();
	
	//Verify the user sees the error message - 'The email address you entered isn't connected to an account. Find your account and log in.'
	String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
	String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
	
	if(expectedErrMsg.equals(actualErrMsg)) {
		System.out.println("Test Case Passed");
	}
	else {
		System.out.println("Test Case Failed");
	}
	
	//Close the browser
	driver.quit();
	}
}
