package com.leetcode.arraysandstring.plusone;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,9,9,9,1};
		int num[] = plusOne(nums);
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	public static int[] plusOne(int[] digits) {
		for (int i=digits.length-1; i>=0; i--) {
			digits[i] = (digits[i]+1)%10;
			if(digits[i] != 0) {
				return digits;
			}
		}
		int[] nums = new int[digits.length+1];
		nums[0] = 1;
		return nums;
	}
}
