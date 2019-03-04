package com.leetcode.arraysandstring.containduplicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for (int i =0; i<nums.length; i++) {
        	if(li.contains(nums[i])) {
        		return true;
        	}
        	li.add(nums[i]);
        }
		return false;
    }
}
