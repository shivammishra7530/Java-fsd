package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
ChromeDriver driver;
	
	@BeforeTest
	
	public void launchApplication() {
		//Open the browser
		 driver = new ChromeDriver();
		
		//Navigate to the application
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titleVerification() {
		//3)Verify the visitor on the page sees the title -'Facebook log in or sign up'
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
}
}
