package com.hackerrank.strings.sherlockandanagrams;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(sherlockAndAnagrams("cdcd"));
	}
	public static int sherlockAndAnagrams(String s) {
		int res = 0;
		List<String> li = new ArrayList<>();
		for (int len=1; len<s.length(); len++) {
			for(int i=0; i+len <= s.length(); i++) {
				li.add(s.substring(i, i+len));
			}
			System.out.println("List:"+li);
			for (int i=0; i<li.size()-1; i++) {
				for (int j=i+1; j<li.size(); j++) {
					if (isAnagram(li.get(i),li.get(j))) {
						res++;
						System.out.println(li.get(i)+" "+li.get(j));
					}
				}
			}
			li.clear();
		}
		return res;
    }
	public static boolean isAnagram(String s1, String s2) {
		int str[] = new int[26];
		for (int i=0; i<s1.length(); i++) {
			str[s1.charAt(i)-'a']++;
		}
		for (int i=0; i<s2.length(); i++) {
			str[s2.charAt(i)-'a']--;
		}		
		for (int i=0; i<26; i++) {
			if(str[i] != 0)
				return false;
		}
		return true;
	}
}
