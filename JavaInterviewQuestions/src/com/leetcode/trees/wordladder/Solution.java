package com.leetcode.trees.wordladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		//System.out.println(ladderLength("hit", "cog", new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log","cog"))));
		System.out.println(ladderLength("hit", "cog", new ArrayList<String>(Arrays.asList("hot","dot","dog","lot","log"))));
		
	}
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int res = 1;
        if (!wordList.contains(endWord)) return 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<String>();
        queue.add(beginWord);
        queue.add(null);
        visited.add(beginWord);
        while (!queue.isEmpty()) {
        	String item = queue.poll();    		
        	if (item != null) {
        		for (int i = 0; i < item.length(); i++) {
        			char[] chars = item.toCharArray();
        			for (char c = 'a'; c <= 'z'; c++) {
        				chars[i] = c;
        				String word = new String(chars);
        		        if(word.equals(endWord)) {
        		        	return res+1;
        		        }
        		        if(wordList.contains(word) && !visited.contains(word)) {
        		        	queue.add(word);
        		        	visited.add(word);
        		        }
        			}
        		}
        	} else  {
        		res++;
        		if (!queue.isEmpty()) { 
        	        queue.add(null);
        	    }
        	}
        }
        return 0;
    }
	/*public static boolean oneStepAway(String str1, String str2) {
		int count = 0, i=0;
		if(str1.length() != str2.length()) return false;
		while (i<str1.length()) {
			if(str1.charAt(i) != str2.charAt(i)) {
				count++;
				if(count > 1) {
					return false;
				}
			}
			i++;
		}
		if(count == 1)
			return true;
		return true;
	}*/
}
