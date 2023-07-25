package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Demo2 {

	@Test
	public void testAssertion() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 =5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String [] resultArray = {"one", "two", "three"};
		
		//check that two objects are equal
		assertEquals(str1, str2);
		
		//Check that a condition is true
		assertTrue(val1 < val2);
		
		//Check that a condition is false
		assertFalse(val1>val2);
		
		//Check that an object is not null
		assertNotNull(str1);
		
		//Check of two object refrences point to the same object
		assertSame(str4, str5);
		
		//Check if two object refrences do not point to the same object
		assertNotSame(str1, str3);
		
		//Check if 2 arrays are equals
		assertArrayEquals(expectedArray, resultArray);
		
		
	}
	
}
