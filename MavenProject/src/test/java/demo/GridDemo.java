package demo;
import java.net.MalformedURLException;
import java.net.MalformedURLException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo {
WebDriver driver;

@BeforeTest
public void launchApplication() throws MalformedURLException{
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("https://facebook.com");
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
