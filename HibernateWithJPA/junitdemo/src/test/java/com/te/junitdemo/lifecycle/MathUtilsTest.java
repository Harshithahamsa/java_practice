package com.te.junitdemo.lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("Test cases for math utils")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
	MathUtils mathUtils;
	
	@Test
	public void addTest() {
//		mathUtils = new MathUtils();
		System.out.println("Inside add test");
		assertEquals(10, mathUtils.add(5, 5), "This is the test case for add");
		
	}

	@Test
	public void devideTest() {
//		mathUtils = new MathUtils();
		System.out.println("inside divide test");
		assertThrows(ArithmeticException.class, () -> mathUtils.devide(10, 2));
		
	}
	
	@BeforeEach
	public void init() {
		System.out.println("Before Each");
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	public void destroy() {
		System.out.println("After Each");
		mathUtils = null;

	}
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("inside before all");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("Inside after all");
	}
}
