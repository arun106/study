package com.leetcode.arraysandstring.movezeros;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,0,3,4,2,0};
		moveZeroes(nums);
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
    public static void moveZeroes(int[] nums) {
    	int insertpos = 0;
    	for (int i=0; i<nums.length; i++) {
    		if(nums[i] != 0) {
    			nums[insertpos++] = nums[i];
    		}
    	}
    	while(insertpos < nums.length) {
    		nums[insertpos++] = 0;
    	}
    }
}
