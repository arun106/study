package com.leetcode.sorting.topkfrequent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8};
		System.out.println(topKFrequent(nums, 2));
	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int max = 0;
        
        for (int i=0; i<nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		int value = map.get(nums[i]);
        		value++;
        		map.put(nums[i], value);
        	}
        	else {
        		map.put(nums[i],1);
        	}
        }
        
        for(Map.Entry<Integer, Integer> m:map.entrySet()) {
        	if (m.getValue() > max) {
        		max = m.getValue();
        	}
        }
        ArrayList<Integer>[] arr = new ArrayList[max+1];
        for (int i=0; i<=max; i++) {
        	arr[i] = new ArrayList();
        }
        for(Map.Entry<Integer, Integer> m:map.entrySet()) {
            arr[m.getValue()].add(m.getKey());
        }
        List<Integer> list = new ArrayList();
		for (int i=max; i>=1; i--) {
			if(arr[i].size() > 0) {
				System.out.println(arr[i]);
				for (Integer value:arr[i]) {
					if(list.size()==k)
						break;
					list.add(value);
				}
			}
			if(list.size()==k)
				break;
		}
        return list;
    }
	
	/*public static <K,V extends Comparable>List<Entry<K, V>> entriesSortedByValues(Map<K,V> map) {
		List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());

		Collections.sort(sortedEntries, new Comparator<Entry<K,V>>() {
			@Override
			public int compare(Entry<K,V> e1, Entry<K,V> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		}
		);
		return sortedEntries;
	}*/
}
