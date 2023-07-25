package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Demo4 {

	@Test
	public void test1() {
		//assertTrue("abc".contains("z"));
		Assumptions.assumeTrue("abc".contains("a"));
		System.out.println("sunday");
	}
	
	@Test
	public void test2() {
		Assumptions.assumingThat("abc".contains("a"), ()->{
			System.out.println("Friday");
		});
		
		
		
	}
}
