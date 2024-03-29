package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {

	Calculator calculator = null;
	@BeforeAll
	static void init() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("called after each testcases");
		
	}

	@Test
	void testSum() {
		int actual = calculator.sum(10,20);
		Assertions.assertEquals(30, actual,"expected output is 30 ");
	}
	
	@Test
	@Disabled
	void testProduct() {
		int actual = calculator.product(3, 5);
		Assertions.assertEquals(15, actual,"expected output is 15 ");
	}
	
	@Test
	@Disabled
	void testMessage(){
		String actual = calculator.greetMesssage("bullet basya");
		assertEquals("bullet basya", actual,"expected output is bullet basya");
	}
	
	@Test
	@Tag("first")
	void testShowCourses() {
		List<String> coursesInput = Arrays.asList("Java","Spring","React","Html");
		List<String> expected = Arrays.asList("Html","Java","React","Spring");
		List<String> actual = calculator.showCourses(coursesInput);
		Collections.sort(actual);
		assertEquals(expected, actual);
		
	}

}
