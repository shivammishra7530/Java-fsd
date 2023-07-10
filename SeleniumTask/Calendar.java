package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
public static void main(String[] args) {
	//1)Open the browser
			ChromeDriver driver = new ChromeDriver();
			
	    //2)Maximize it
		driver.manage().window().maximize();
			
			//3)Navigate to the application
			driver.get("https://www.expedia.co.in/");
			
		//4) Click on Calendar icon
			driver.findElement(By.id("date_form_field-btn")).click();
			
		//5) Select 9th from the next month
			WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class,'weeks')])[2]"));
			List<WebElement> rows = nextMonth.findElements(By.tagName("tr"));
			
			for(int i = 1; i<rows.size(); i++) {
				WebElement row = rows.get(i);
				List<WebElement> columns = row.findElements(By.tagName("button"));
				
				for(WebElement x : columns) {
					if(x.getAttribute("data-day").equals("9")) {
						x.click();
						break;//stop searching rest of the dates by coming out of the for-each loop
						}
				}
			}
			
			//6)Click on 'Done' to close the Calendar
			driver.findElement(By.xpath("//button[contains(@data-stid,'apply-date')]")).click();			
}
}
