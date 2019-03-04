package com.interviews.sale;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedAdjacentSwapTests {

	@Test
	public void test() {
		int[] arr = {1,2,3,6,4};
		boolean flag = SortedAdjacentSwap.isswapsortpossible(arr);
		assertEquals(true, flag);
	}
	
	@Test
	public void test1() {
		int[] arr = {9,2,3,6,7};
		boolean flag = SortedAdjacentSwap.isswapsortpossible(arr);
		assertEquals(true, flag);
	}
	
	@Test
	public void test2() {
		int[] arr = {9,2,3,6,5};
		boolean flag = SortedAdjacentSwap.isswapsortpossible(arr);
		assertEquals(false, flag);
	}
	
	@Test
	public void test3() {
		int[] arr = {9,2,12,6,5};
		boolean flag = SortedAdjacentSwap.isswapsortpossible(arr);
		assertEquals(false, flag);
	}
}
