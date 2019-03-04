package com.leetcode.math.largestnumber;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,30,34,5,9};
		System.out.println(largestNumber(nums));
		
	}
	public static String largestNumber(int[] nums) {
		if(nums == null || nums.length == 0)
		    return "";
		String[] str = new String[nums.length];
		for (int i=0; i<nums.length; i++)
		{
			str[i] = String.valueOf(nums[i]);
		}
		Comparator<String> comp = new Comparator<String>(){
			public int compare(String s1, String s2) {
				String str1 = s1+s2;
				String str2 = s2+s1;
				return str2.compareTo(str1);
			}
		};
		Arrays.sort(str, comp);
		if(str[0].charAt(0) == '0') {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<nums.length; i++) {
			sb.append(str[i]);
		}
		
		return sb.toString();
    }
}
