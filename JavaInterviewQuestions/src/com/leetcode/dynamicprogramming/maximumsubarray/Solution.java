package com.leetcode.dynamicprogramming.maximumsubarray;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(nums));
	}
	public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for(int i=1; i<nums.length; i++) {
        	maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
        	maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}
