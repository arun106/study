package com.hackerrank.search.sherlockandarray;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(5); 
		arr.add(6); 
		arr.add(8); 
		arr.add(11);
		System.out.println(balancedSums(arr));
	}
	public static String balancedSums(List<Integer> arr) {
		int array[] = new int[arr.size()];
		int i = 0, sum = 0;
		for(int value:arr) {
			sum+=value;
			array[i] = sum;
			i++;
		}
		sum=0;
		for(i=array.length-1; i>=0; i--) {
			sum+=arr.get(i);
			if (sum == array[i]) {
				return "YES";
			}
		}
		return "NO";
    }
}
