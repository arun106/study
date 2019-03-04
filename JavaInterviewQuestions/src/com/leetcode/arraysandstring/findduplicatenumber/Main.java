package com.leetcode.arraysandstring.findduplicatenumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,2,5,6,7,4};
		System.out.println(findDuplicate(num));
	}
	public static int findDuplicate(int[] nums) {
		if(nums.length > 1) {
			int slow = nums[0], fast = nums[nums[0]];
			
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}
			fast = 0;
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[fast];
			}
			return slow;
		}
		
		return -1;
    }
}
