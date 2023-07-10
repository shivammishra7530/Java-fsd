package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
public static void main(String[] args) {
	//1)Open the browser
		ChromeDriver driver = new ChromeDriver();
		
    //2)Maximize it
	driver.manage().window().maximize();
		
		//3)Navigate to the application
		driver.get("https://letcode.in/table");
		
		//4) Sum of all the prices shown in the table and verify it should be equlal to 858
		WebElement firstTable = driver.findElement(By.id("shopping"));
		
		//4.1) Capture all the rows of the table and put them in a list
		List<WebElement> rows = firstTable.findElements(By.tagName("tr"));
		
		//4.2) From each row capture all the td elements in a separate list and then get the 2nd td element
		//From the new list
		int sum = 0;
		for(int i=1; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			int price = Integer.parseInt(columns.get(1).getText());
			sum = sum + price;
		}
		
		int expectedSum = 858;
		if(expectedSum==sum) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.quit();
		
}
}
