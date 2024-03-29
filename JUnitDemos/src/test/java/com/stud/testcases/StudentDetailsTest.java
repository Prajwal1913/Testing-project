package com.stud.testcases;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.InvalidNameException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {

	StudentDetails studentDetails = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before the testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		studentDetails = new StudentDetails();
		System.out.println("before the each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after the each testcases");
	}

	@Test			
	void testTotalMarks() throws InvalidNumException {
		int actual = studentDetails.totalMarks(35,40,250);
		Assertions.assertEquals(100, actual,"expected output is 100 ");
	}
	
//	@Test
//	@DisplayName("testing of negative marks")
//	@Tag("negative")
//	void testNegMarks() {
//		Assertions.assertThrows(InvalidNumException.class,()->studentDetails.totalMarks(35,-40,25));
//	}
//	
//	@Test
//	@DisplayName("testing of greater marks")
//	void testGreaterMarks() {
//		Assertions.assertThrows(InvalidNumException.class,()->studentDetails.totalMarks(35,40,250));
//	}

}
