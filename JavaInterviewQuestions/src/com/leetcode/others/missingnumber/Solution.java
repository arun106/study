package com.leetcode.others.missingnumber;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[] {0, 1, 3}));
	}
	public static int missingNumber(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
        	sum += nums[i];
        	max = Math.max(max, nums[i]);
        }
        return (max*(max+1)/2 - sum);
    }
}
