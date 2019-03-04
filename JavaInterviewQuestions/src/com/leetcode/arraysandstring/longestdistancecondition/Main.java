package com.leetcode.arraysandstring.longestdistancecondition;

public class Main {

	public static void main(String[] args) {
		int nums[] = {6, 9, 3, 2, 10, 2, 3};
		System.out.println(findLongest(nums));
	}
	/*Find longest satisfying A[i] < A[j] & i<j */
	public static int findLongest(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int max = 0, n = nums.length;
		/*for (int i=0; i<nums.length-1; i++) {
			for (int j=nums.length-1; j>i; j--) {
				if (nums[i] < nums[j]) {
					max = Math.max(max, j-i);
				}
			}
		}*/
		int lmin[] = new int[n];
		int rmax[] = new int[n];
		lmin[0] = nums[0];
		for (int i=1; i<n; i++) {
			lmin[i] = Math.min(lmin[i-1], nums[i]);
		}
		rmax[n-1]=nums[n-1];
		for (int i=n-2; i>=0; i--) {
			rmax[i] = Math.max(nums[i], rmax[i+1]);
		}
		
		int i=0, j=0, maxdiff = 0;
		while (j<n && i<n) {
			if(lmin[i] < rmax[j]){
				maxdiff = Math.max(maxdiff, j-i);
				j++;
			}
			else {
				i++;
			}
		}
		return max;
	}

}
