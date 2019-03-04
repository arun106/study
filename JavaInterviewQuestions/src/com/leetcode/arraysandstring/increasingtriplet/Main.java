package com.leetcode.arraysandstring.increasingtriplet;

/*
Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
Formally the function should

Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 <= i < j < k <= n-1 else return false.
Note: Your algorithm should run in O(n) time complexity and O(1) space complexity. 
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,4,3,6,1,7};
		System.out.println(increasingTriplet(nums));
	}
	public static boolean increasingTriplet(int[] nums) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
		
        for (int i=0; i<nums.length; i++) {
        	if(nums[i] <= s1) {
        		s1 = nums[i];
        	} else if(nums[i] <= s2) {
        		s2 = nums[i];
        	} else {
        		return true;
        	}
        }
		return false;
    }
}
