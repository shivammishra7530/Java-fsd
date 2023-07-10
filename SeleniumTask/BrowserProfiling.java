package SeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserProfiling {
public static void main(String[] args) {
	//Disable push notification in Chrome Browser
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://yatra.com");
}
}
