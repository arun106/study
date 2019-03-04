package com.leetcode.arraysandstring.longsubstrwithoutrepeatingchar;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		int max = 0;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for (int i=0, j=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				j = Math.max(j, map.get(c)+1);
			}
			map.put(c, i);
			max = Math.max(max, i-j+1);
		}
		return max;
	}
}
