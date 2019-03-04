package com.interviews.pp;

import java.util.Arrays;

public class MultiplicationProblem {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6};
		System.out.println(count(arr, 15));
	}
	public static int count(int[] arr, int value) {
		int res = 0;
		Arrays.sort(arr);
		for (int i=0; i<arr.length; i++) {
			int k = value/arr[i];
			for (int j=0; j<arr.length; j++) {
				if(arr[j] > k) {
					break;
				}
				res++;
			}
		}
		return res;
	}

}
