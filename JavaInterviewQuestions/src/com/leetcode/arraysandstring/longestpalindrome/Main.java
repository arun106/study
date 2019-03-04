package com.leetcode.arraysandstring.longestpalindrome;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("XXABCDEDCBA"));
	}
    public static String longestPalindrome(String s) {
    	if(s==null || s.length()<=1)
            return s;
    	int len = s.length(), longest = 0;
    	String sub = "";
    	boolean dp[][]= new boolean[len][len];
    	for (int l=0; l<len; l++) {
    		for (int i=0; i<len-l; i++) {
    			int j = i+l;
    			System.out.println("i="+i+" j="+j+" l="+l+" len="+len);
    			if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])) {
    				dp[i][j] = true;
    				if ((j-i+1) > longest) {
    					longest = j-i+1;
    					sub = s.substring(i, j+1);
    				}
    			}
    		}
    	}
    	
    	return sub;
    }
   
}
