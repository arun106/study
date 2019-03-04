package com.leetcode.arraysandstring.intersectiontwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int nums1[] = {1,2,3,4,2};
		int nums2[] = {1,2,2,1};
		int nums[] = intersect(nums1,nums2);
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
    public static int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i=0; i<nums1.length; i++) {
    		if(map.containsKey(nums1[i])) {
    			map.put(nums1[i], map.get(nums1[i])+1);
    		}
    		else {
    			map.put(nums1[i], 1);
    		}
    	}
    	for (int i=0; i<nums2.length; i++) {
    		if(map.containsKey(nums2[i])) {
    			if(map.get(nums2[i]) > 0) {
    				list.add(nums2[i]);
    				map.put(nums2[i],map.get(nums2[i])-1);
    			}
    		}
    	}
    	int nums[] = new int[list.size()];
    	for (int i=0; i<list.size(); i++) {
    		nums[i] = list.get(i);
    	}
    	return nums;
    }
}
