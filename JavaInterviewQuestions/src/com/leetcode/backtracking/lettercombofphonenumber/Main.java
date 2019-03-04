package com.leetcode.backtracking.lettercombofphonenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println(letterCombinations("234"));
	}
	public static List<String> letterCombinations(String digits) {
        HashMap<Character,List<Character>> map = new HashMap();
        map.put('2',Arrays.asList('a','b','c'));
        map.put('3',Arrays.asList('d','e','f'));
        map.put('4',Arrays.asList('g','h','i'));
        map.put('5',Arrays.asList('j','k','l'));
        map.put('6',Arrays.asList('m','n','o'));
        map.put('7',Arrays.asList('p','q','r','s'));
        map.put('8',Arrays.asList('t','u','v'));
        map.put('9',Arrays.asList('w','x','y','z'));
		
        int len = digits.length();
        List<String> list = new ArrayList<String>();
        for (int i=0; i<len; i++) {
        	char c = digits.charAt(i);
        	if (i==0) {
        		for(char c1:map.get(c)) {
        			list.add(String.valueOf(c1));
        		}
        	} else {
        		List<String> templist = new ArrayList<String>();
        		for (String s:list) {
        			for (char cdigit:map.get(c)) {
        				System.out.println("s="+s+" c="+cdigit);
        				templist.add(s+cdigit);
        			}
        		}
        		list = templist;
        	}
        }
		return list;
    }

}
