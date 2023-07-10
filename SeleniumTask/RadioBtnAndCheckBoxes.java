package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxes {
public static void main(String[] args) {
	//1)Open the Driver
	ChromeDriver driver = new ChromeDriver();
	
	//2)Maximize the browser
	driver.manage().window().maximize();
	
	//3)Navigate to the application
	driver.get("https://letcode.in/radio");
	
	//4)Select 'Yes' radio button from 'Select any one' option.
	driver.findElement(By.id("yes")).click();
	
	//5) Check the last box
	driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
	
}
}
