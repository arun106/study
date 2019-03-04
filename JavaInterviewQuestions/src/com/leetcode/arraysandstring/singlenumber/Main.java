package com.leetcode.arraysandstring.singlenumber;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,4,2,3,1,5};
		System.out.println(singleNumber(nums));
	}
    public static int singleNumber(int[] nums) {
    	int output = 0;
    	for (int i=0; i<nums.length; i++) {
    		output ^= nums[i];
    	}
    	return output;
    }
}
