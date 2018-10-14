package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int output = test.square(10);
		assertEquals(100, output);
	}
	
	@Test
	public void testagain() {
		JunitTest test = new JunitTest();
		int output = test.square(5);
		assertEquals(25, output);
	}
}
