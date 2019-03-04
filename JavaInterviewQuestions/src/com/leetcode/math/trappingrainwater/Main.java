package com.leetcode.math.trappingrainwater;

public class Main {
	/*Given n non-negative integers representing an elevation map where the width of each bar is 1, 
	 * compute how much water it is able to trap after raining. 
	 */
	public static void main(String[] args) {
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
	}
	
	public static int trap(int[] height) {
        int i = 0, j=height.length-1, max = 0;
        int leftmax = 0, rightmax = 0;
        if (height.length < 2) {
        	return 0;
        }
        while (i<=j) {
        	leftmax = Math.max(leftmax, height[i]);
        	rightmax = Math.max(rightmax, height[j]);
        	if (leftmax < rightmax) {
        		max+=leftmax-height[i];
        		i++;
        	}
        	else {
        		max+=rightmax-height[j];
        		j--;
        	}
        }
		return max;
    }
}
