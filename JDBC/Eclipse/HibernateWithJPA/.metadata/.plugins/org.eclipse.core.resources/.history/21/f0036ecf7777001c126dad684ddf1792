package com.te.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("Test cases for math utils")
public class MathUtilsTest {
	@Test
	public void addTest() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(10, mathUtils.add(5, 5), "This is the test case for add");
	}

	@Test
//	@DisplayName("divide")
	@Disabled
//	@EnabledOnOs(value = OS.WINDOWS)
	public void devideTest() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.devide(10, 10));
	}
}
