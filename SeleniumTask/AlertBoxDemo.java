//Using Selenium WebDriver, write a program to handle alerts.

package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
public static void main(String[] args) throws InterruptedException {
	
	//1)Open the browser
			ChromeDriver driver = new ChromeDriver();
			
	    //2)Maximize it
		driver.manage().window().maximize();
			
			//3)Navigate to the application
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			
			//4)Click on 'CONTINUE TO LOGIN BUTTON' button
			driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
			
			//5)Click on 'Login' button
			driver.findElement(By.id("Button2")).click();
			
			Thread.sleep(3000);
			
			//6)Close the Alert Box
			driver.switchTo().alert().accept();			
}
}
