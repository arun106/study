package com.leetcode.arraysandstring.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(str));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<List<String>>();
		HashMap<String,List<String>> map = new HashMap();
		
		for (String s:strs) {
			 char c[] = s.toCharArray();
			 Arrays.sort(c);
			 String key = String.valueOf(c);
			 if(!map.containsKey(key)) {
				 map.put(key, new ArrayList()); 
			 }
			 map.get(key).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}
	
	/*public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<List<String>>();
		int[] flag = new int[strs.length];
		for (int i=0; i<strs.length; i++) {
			if(flag[i] == 0) {
				flag[i] = 1;
				ArrayList<String> al = new ArrayList();
				al.add(strs[i]);
				for (int j= i+1; j<strs.length; j++) {
					if(flag[j] == 0) {
						if (isAnagram(strs[i], strs[j])) {
							al.add(strs[j]);
							flag[j] = 1;
						}
					}
				}
				list.add(al);
			}
		}
		return list;
    }
	public static boolean isAnagram(String str1, String str2) {
		int[] num = new int[256];
		for (int i=0; i<str1.length(); i++) {
			num[str1.charAt(i)]++;
		}
		for (int i=0; i<str2.length(); i++) {
			num[str2.charAt(i)]--;
		}
		for (int i=0; i<256; i++) {
			if (num[i] != 0) {
				return false;
			}
		}
		return true;
	}*/

}
