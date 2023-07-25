package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@IncludeTags("production")
public class Demo14 {
	@Test
	@Tag("development")
	@Tag("production")
	public void tst1() {
		
	}
	
	@Test 
	@Tag("production")
	public void test2() {
		
	}
	
	@Test
	@Tag("development")
	public void test3() {
		
	}
}
