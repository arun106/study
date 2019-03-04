package com.leetcode.arraysandstring.besttimetobuyandsellstock;

public class Main {

	public static void main(String[] args) {
		int num[] = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(num));
	}
    public static int maxProfit(int[] prices) {
    	int sum = 0;
    	for (int i=1; i<prices.length; i++) {
    		if(prices[i] > prices[i-1]) {
    			sum+= (prices[i]-prices[i-1]);
    		}
    	}
    	return sum;
    }
}
