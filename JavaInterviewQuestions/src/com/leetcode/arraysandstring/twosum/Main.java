package com.leetcode.arraysandstring.twosum;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		int[] res = twoSum(num,10);
		System.out.println(res[0]+" "+res[1]);
	}
    public static int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int[] res = new int[2];
    	for (int i=0; i<nums.length; i++) {
    		if (map.containsKey(target-nums[i])) {
    			res[0] = map.get(target-nums[i]);
    			res[1] = i;
    		}
    		map.put(nums[i], i);
    	}
    	return res;
    }
}
