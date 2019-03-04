package com.leetcode.dynamicprogramming.besttimetobuyandsellstock;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}
	public static int maxProfit(int[] prices) {
        int res = 0, minsofar = Integer.MAX_VALUE;
		for (int i=0; i<prices.length; i++) {
			minsofar = Math.min(minsofar,prices[i]);
			res = Math.max(prices[i]-minsofar,res);
		}
		return res;
    }
}
