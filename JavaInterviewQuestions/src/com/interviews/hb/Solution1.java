package com.interviews.hb;
/* 
 * Tile weight
 * */
public class Solution1 {

	public static void main(String[] args) {
		
		System.out.println(computeWeight("ARYA"));
	}
	public static int computeWeight(String word) {
		int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,3,3,10,1,1,1,1,4,4,8,4,10};
		int sum = 0;
		for (int i=0; i<word.length(); i++) {
			sum += values[word.charAt(i) - 'A'];
		}
		return sum;
	}
}
