package com.interviews.am;

import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {

	public static void main(String[] args) {
		int nums[] = {1, 23, 12, 9, 30, 2, 50};
		klargest(nums,3);
	}
	public static int[] klargest(int nums[], int k) {
		if (nums==null || nums.length<k) {
			return null;
		}
		int out[] = new int[k];
		Arrays.sort(nums);
		for (int i =0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		return out;
	}

}
