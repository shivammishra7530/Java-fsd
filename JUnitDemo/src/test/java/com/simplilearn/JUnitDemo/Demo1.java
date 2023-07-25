package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Demo1 {

	@BeforeAll
	public static void setUp() {
		System.out.println("Hello");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Bye Bye");
	}
	
	
}
