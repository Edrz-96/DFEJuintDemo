package com.qa.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	// Junit 5 - Junit 4
	// @BeforeAll - @BeforeClass : Needs to be a static method, this will run before
	// everything else; here we might set up DB connections, etc.
	// @BeforeEach - @Before : Method to run before every test, this best to setup
	// our prereqs before testing, e.g. create an object.
	// @AfterAll - @AfterClass : A static method, ran at the end of everything; used
	// to disconnect or close down our components e.g. DB.close();/scanner.close();
	// @AfterEach - @After : Method to run after every test, best used to tear-down
	// any allocated resource post test. e.g. clearing a list, etc.
	// @Test - @Test : A method that Junit will run, typically containing an
	// assertion.
	// @Disable - @Ignore : Prevents a test by running

	// Failures notify an invalid test result
	// Errors indicate an unexpected test execution
	
	
	File fileIn;

	@BeforeClass
	public static void init() {
		System.out.println("Start of test");
		System.out.println("=========================================");
	}

	@Before
	public void setup() {
		// Calculator calc = new calulator();
		System.out.println("Ran before every test");
		fileIn = new File("thing.csv");
		
	}

	@Test
	@Ignore
	public void someTest() {
		boolean something = false;
		System.out.println("This is a test");
		assertEquals(1, 1);
		assertFalse("This will print if our conditions don't match", something);
		assertTrue("This will print if our conditions don't match", false);
	}

	@Test
	public void someOtherTest() {
		System.out.println("This is a test");
	}

	@After
	public void close() {
		System.out.println("Ran after each test");
		fileIn.delete();
	}

	@AfterClass
	public static void tearDown() {
		// scanner.close();
		System.out.println("End of test");
		System.out.println("=========================================");
	}

}
