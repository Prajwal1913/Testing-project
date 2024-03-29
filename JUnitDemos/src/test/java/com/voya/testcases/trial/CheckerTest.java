package com.voya.testcases.trial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CheckerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing null")
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}
	
	@Test
	@DisplayName("Testing notnull")
	@Tag("second")
	void testNotNull() {
		List<String> mylist = new ArrayList<String>();
		assertNotNull(mylist);   //test case will succeed
		//assertNull(mylist); //test case will fail
	}
	
	@Test
	@DisplayName("Testing string references")
	@Tag("simple")
	void testSame() {
		String username =  "Dada";
	//	String nusername = new String("Dada"); //string ref created in memory pool
		String nusername = "Dada";
		assertSame(username,nusername,"references are not same");
	}

}




















