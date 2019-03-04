package com.leetcode.arraysandstring.removeduplicatefromsortedarray;

public class Main {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4,4,4};
		System.out.println(removeDuplicates(nums));
	}
    public static int removeDuplicates(int[] nums) {
    	int head = 0;
    	for (int i=1; i<nums.length; i++) {
    		if(nums[i] > nums[head]) {
    			head++;
    			if(i>head) {
    				nums[head] = nums[i];
    			}
    		}
    	}
    	return head+1;
    }
}
