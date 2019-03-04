package com.leetcode.arraysandstring.longestconsecutivesequence;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {100, 4, 200, 1, 3, 2, 5, 101, 102, 103, 104, 105, 106, 108};
		System.out.println(longestConsecutive(nums));
	}
	public static int longestConsecutive(int[] nums) {
		TreeSet<Integer> set = new TreeSet<>();
		int len = 0, prev = 0, longest = 0;
        for (int i=0; i<nums.length; i++) {
        	set.add(nums[i]);
        }
        if(set.size() == 0) {
			return 0;
		}
		else if(set.size() == 1) {
			return 1;
		}
        System.out.println(set);
        for (Integer i:set) {
        	if (len == 0) {
        		prev = i;
        		len++;
        	} else {
        		if (prev == i-1) {
        			len++;
        		}
        		else
        		{
        			if (len > longest) {
        				longest = len;
        			}
        			len = 1;
        		}
        	}
        	prev = i;
        	longest = Math.max(longest, len);
        }
		return longest;
    }

}
