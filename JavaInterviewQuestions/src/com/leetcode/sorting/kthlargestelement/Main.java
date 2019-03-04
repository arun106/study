package com.leetcode.sorting.kthlargestelement;

public class Main {

	public static void main(String[] args) {
		int num[] = {3,2,1,5,6,4};
		System.out.println(findKthLargest(num, 3));
	}
	
	public static int findKthLargest(int[] nums, int k) {
        int temp = 0;
		for (int unsorted = nums.length-1; unsorted>0; unsorted--) {
			for (int i=0; i<unsorted; i++) {
				if(nums[i] > nums[i+1]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
		}
		return nums[nums.length-k];
    }

}
