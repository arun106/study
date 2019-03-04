package com.leetcode.arraysandstring.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int num[] = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> li = threeSum(num);
		System.out.println(li);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i=0; i<nums.length-2; i++) {
			if (i>0 && nums[i] == nums[i-1])
				continue;
			int j=i+1, k = nums.length-1, sum = -nums[i];
			while (j<k) {
				if(nums[j] + nums[k] == sum) {
					List<Integer> suml = new ArrayList();
					suml.add(nums[i]);
					suml.add(nums[j]);
					suml.add(nums[k]);
					li.add(suml);
					j++; 
					k--;
					while (j<k && nums[j]==nums[j-1]) j++;
					while (j<k && nums[k]==nums[k+1]) k--;
				} else if (nums[j] + nums[k] > sum) {
					k--;
				} else {
					j++;
				}
			}
		}
		return li;
	}

}
