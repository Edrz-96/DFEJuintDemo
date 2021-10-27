package com.qa.calctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.qa.main.Main;

public class MainTest {

	@Test
	public void mainTest() {

		Main main = new Main();

		assertTrue(main instanceof Main);
	}
}
