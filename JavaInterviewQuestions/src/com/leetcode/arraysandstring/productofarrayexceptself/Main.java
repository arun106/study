package com.leetcode.arraysandstring.productofarrayexceptself;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1, 2, 3, 4, 5}; //Output - 24, 12, 8, 6    - 120, 60, 40, 30, 24
		int output[] = productExceptSelf(num);
		for (int i=0; i<output.length; i++) {
        	System.out.print(output[i]+" ");
        }
	}
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] output = new int[n];
        int[] reverseproduct = new int[n];
        int prev = 1;
        
        for (int i=1; i<n; i++) {
        	prev = prev*nums[i-1];
        	output[i] = prev;
        }
        prev=1;
        for (int i=n-2; i>=0; i--) {
        	prev = prev*nums[i+1];
        	reverseproduct[i] = prev;
        }
        output[0] = reverseproduct[0];
        for (int i=1; i<n-1; i++) {
        	output[i] *= reverseproduct[i];
        }
		return output;
    }
}
