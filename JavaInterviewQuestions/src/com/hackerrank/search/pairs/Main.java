package com.hackerrank.search.pairs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 4, 2};
		System.out.println(pairs(2, arr));
	}
	public static int pairs(int k, int[] arr) {
		int res = 0;
		Set<Integer> set = new HashSet<>();
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		int[] arrnodup = new int[set.size()];
		int i = 0;
		for (int value:set) {
			arrnodup[i] = value;
			i++;
		}
		Arrays.sort(arrnodup);
		for(i=0; i<arrnodup.length; i++) {
			if(binarySearch(arr[i]+k,arrnodup,0,arrnodup.length-1)) {
				res++;
			}
		}
		return res;
    }
	public static boolean binarySearch(int value, int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if (start>mid) {
			return false;
		}
		if(arr[mid] == value) {
			return true;
		}
		else if (arr[mid] > value) {
			return binarySearch(value, arr, start, mid-1);
		}
		else if (arr[mid] < value) {
			return binarySearch(value, arr, mid+1, end);
		}
		return false;
	}
}
