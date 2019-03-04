package com.leetcode.arraysandstring.containerwithmostwater;

public class Main {

	public static void main(String[] args) {
		int[] a = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(a));
	}
	public static int maxArea(int[] height) {
        int res = 0, n = height.length;
        int left = 0, right = n-1;
        while (left < right) {
        	res = Math.max(res, Math.min(height[left], height[right])*(right-left));
        	if (height[left] < height[right]) {
        		left++;
        	}
        	else {
        		right--;
        	}
        }
        return res;
    }
}
