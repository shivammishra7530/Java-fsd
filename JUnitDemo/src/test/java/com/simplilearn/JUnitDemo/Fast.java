package com.simplilearn.JUnitDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("fast")
@Test

public @interface Fast {

}
