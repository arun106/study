package com.leetcode.arraysandstring.rotatearrayksteps;

public class Main {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7};
		rotate(num, 7);
	}
    public static void rotate(int[] nums, int k) {
    	k = k%nums.length;
    	reverse(nums,0,nums.length-1);
    	reverse(nums,0,k-1);
    	reverse(nums,k,nums.length-1);
    	for (int i=0; i<nums.length; i++) {
    		System.out.print(nums[i]+",");
    	}
    }
    public static void reverse(int nums[], int start, int end) {
    	while (start < end) {
    		int temp = nums[start];
    		nums[start] = nums[end];
    		nums[end] = temp;
    		start++;
    		end--;
    	}
    }
}
