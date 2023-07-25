package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class Demo6 {
	
	
@RepeatedTest(5)
public void test1() {
	System.out.println("Hello..!");
}

@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetition}")
@DisplayName("Execution")
public void test2(TestInfo testinfo) {
	System.out.println(testinfo.getDisplayName());
}

@RepeatedTest(5)
public void test3(RepetitionInfo repetitionInfo) {
	System.out.println("Current Test count" + repetitionInfo.getCurrentRepetition());
}
	
}

