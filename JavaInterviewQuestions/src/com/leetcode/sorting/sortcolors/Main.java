package com.leetcode.sorting.sortcolors;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,1,2,1,2,0};
		sortColors(arr);
	}
	public static void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        
        for (int i=0; i<nums.length; i++) {
        	if(nums[i] == 0 || nums[i] == 1 || nums[i] == 2) {
        		int value = map.get(nums[i]);
        		value++;
        		map.put(nums[i], value);
        	}
        }
        
        int k = 0;
        for(Integer i: map.keySet()) {
        	int j = map.get(i);
        	while (j>0) {
        		nums[k++] = i;
        		j--;
        	}
        }
        
        for (int i=0; i<nums.length; i++)
        	System.out.print(nums[i] + " ");
    }
}
