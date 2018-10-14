package com.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestA {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int count = test.countA("arunmohan");
		assertEquals(2,count);
	}

}
