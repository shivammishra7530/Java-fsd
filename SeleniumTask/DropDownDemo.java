package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
public static void main(String[] args) {
	//1)Open the browser
	ChromeDriver driver = new ChromeDriver();
	
	//)Maximize it
driver.manage().window().maximize();
	
	//3)Navigate to the application
	driver.get("https://letcode.in/dropdowns");
	
	//4)Select Java from the 3rd drop-down
	WebElement languages = driver.findElement(By.id("lang"));
	Select select = new Select(languages);
	select.selectByVisibleText("Java");
	
}
}
