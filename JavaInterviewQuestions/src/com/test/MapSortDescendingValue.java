package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortDescendingValue {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("a", 5);
		map.put("b", 15);
		map.put("c", 25);
		map.put("d", 35);
		map.put("e", 10);

		List<Entry<String,Integer>> list = entriesSortedByValues(map);
		System.out.println(list);
	}
	
	public static <K,V extends Comparable>List<Entry<K, V>> entriesSortedByValues(Map<K,V> map) {
		List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());

		Collections.sort(sortedEntries, new Comparator<Entry<K,V>>() {
			@Override
			public int compare(Entry<K,V> e1, Entry<K,V> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		}
		);

		return sortedEntries;
	}
}
