package com.leetcode.searching.peakelement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,1,3,5,6,4};
		System.out.println(findPeakElement(nums));
	}
	public static int findPeakElement(int[] nums) {
		int value = 0, size = nums.length;
		
		for(int i=0; i<nums.length; i++) {
			if(i==0 && size>1) {
				if(nums[i] > nums[i+1])
					value = i;
			}
			else if(i==size-1 && size>1) {
				if(nums[i] > nums[i-1])
					value = i;
			}
			else if (size > 1){
				if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
					value = i;
				}
			}
			else {
				value = i;
			}
		}
		
		return value;
    }
}
