package demo;

import org.testng.annotations.Test;

public class GroupingDemo {

	@Test(groups = "Luxury Cars")
	public void Car1() {
		System.out.println("Mercedes");
	}
	
	@Test(groups = "Luxury Cars")
	public void Car2() {
		System.out.println("BMW");
	}
	
	
	@Test(groups = {"Car", "Luxury Cars"})
	public void Car3() {
		System.out.println("Toyota");
	}
	
	@Test(groups = "Car")
	public void Car4() {
		System.out.println("Hyundai");
	}
	
	@Test(groups = "Car")
	public void Car5() {
		System.out.println("Honda");
	}
	
}
