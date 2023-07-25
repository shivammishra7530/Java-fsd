package com.simplilearn.JUnitDemo;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo10 {
@ParameterizedTest
@ValueSource(strings = "SECONDS")
public void test1(TimeUnit arg) {
	System.out.println(arg.name());
	assertNotNull(arg.name());
}

}
