package com.leetcode.searching.searchrange;

public class Main {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		searchRange(nums, 8);
	}
	public static int[] searchRange(int[] nums, int target) {
		int output[] = {-1, -1};
        int first = findFirstOccurrence(nums, target, 0, nums.length-1);
        int last = findLastOccurrence(nums, target, 0, nums.length-1);
		System.out.println(first+" "+last);
		if (first < nums.length) {
			output[0] = first;
			output[1] = last;	
		}
		return output;
    }
	
	public static int findFirstOccurrence (int[] nums, int target, int start, int end) {
		if (start > end)
			return Integer.MAX_VALUE;
		int mid = (start+end)/2;
		int foundIndex = Integer.MAX_VALUE, leftIndex = Integer.MAX_VALUE, rightIndex = Integer.MAX_VALUE;
		if(nums[mid] == target) {
			foundIndex = mid;
		}
		if(target <= nums[mid]) {
			leftIndex = findFirstOccurrence(nums, target, start, mid-1);
		}
		else {
			rightIndex = findFirstOccurrence(nums, target, mid+1, end);
		}
		return Math.min(foundIndex, Math.min(leftIndex, rightIndex));
	}
	
	public static int findLastOccurrence (int[] nums, int target, int start, int end) {
		if (start > end)
			return Integer.MIN_VALUE;
		int mid = (start+end)/2;
		int foundIndex = Integer.MIN_VALUE, leftIndex = Integer.MIN_VALUE, rightIndex = Integer.MIN_VALUE;
		if(nums[mid] == target) {
			foundIndex = mid;
		}
		if(target < nums[mid]) {
			leftIndex = findLastOccurrence(nums, target, start, mid-1);
		}
		else {
			rightIndex = findLastOccurrence(nums, target, mid+1, end);
		}
		return Math.max(foundIndex, Math.max(leftIndex, rightIndex));
	}
}
