package com.qa.calctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.calc.Calculator;

public class CalculatorTest {

	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}

//	@Test
//	@Ignore
//	public void constructorTest() {
//		Calculator calc = new Calculator();
//		assertTrue(calc instanceof Calculator);
//	}

	@Test
	public void secondConstructorTest() {
		Calculator calc = new Calculator(1);
		assertTrue(calc instanceof Calculator);
	}

	@Test
	public void additionTest() {

		assertEquals(calc.addition(1, 1), 2.05, 0.1d);
	}

	@Test
	public void subtractionTest() {

		assertEquals(calc.subtraction(3, 2), 1, 0);

	}

	@Test
	public void divFailTest() {

		assertEquals(calc.div(5, 0), 0, 0);
	}

	@Test
	public void divPassTest() {

		assertEquals(calc.div(5, 1), 5, 0);
	}

	@Test
	public void multTest() {

		assertEquals(calc.mult(2, 4), 8, 0);
	}

}
