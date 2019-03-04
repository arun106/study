package com.interviews.hb;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		String[] strArr = {"7", "wa", "s", "ab", "as", "bar","was"};
		System.out.println(ScrableSolver(strArr));
		
		String[] strArr1 = {"15", "cat", "s", "as", "after", "apple","bat", "cat", "cats", "department", "game", "games", "going", "scat", "water"};
		System.out.println(ScrableSolver(strArr1));

	}
	
	public static String ScrableSolver(String[] strArr) {
		String s1 = strArr[1], s2 = strArr[2];
		int len = strArr.length, count = 0;
		if(len < 3)
			return "0";
		List<String> list = new ArrayList<String>();
		
		//Append second after first
		list.add(s1+s2);
		//Append second before first 
		list.add(s2+s1);
		
		//Find unique strings
		for(int i=0; i<s1.length(); i++) {
			list.add(s2+s1.charAt(i));
			list.add(s1.charAt(i)+s2);
		}
		//Find the count
		for (int i=3; i<len; i++) {
			if(list.contains(strArr[i])) {
				count++;
			}
		}
		strArr[0] = count+"";
		return strArr[0];
	}
}
