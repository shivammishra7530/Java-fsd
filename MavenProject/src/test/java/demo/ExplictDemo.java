package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplictDemo {
ChromeDriver driver;

@BeforeTest
//Open the browser
public void launchApplication(){
	driver = new ChromeDriver();

	//Navigate to the application
	driver.get("https://www.facebook.com/");

}

@Test
public void verification(){
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
}


@AfterTest
public void closeBrowser() {
	driver.quit();
}
}
