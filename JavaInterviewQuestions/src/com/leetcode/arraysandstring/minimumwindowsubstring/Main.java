package com.leetcode.arraysandstring.minimumwindowsubstring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minWindow("ABCDOBECODEBANC", "ABC"));
	}
	public static String minWindow(String s, String t) {
	    int[] tarr = new int[256];
	    for (int i=0; i<t.length(); i++) {
	    	tarr[t.charAt(i)]++;
	    }
	    String res = "";
	    int right = 0, len = Integer.MAX_VALUE;
	    int sarr[] = new int[256];
	    for(int i=0; i<s.length(); i++) {
	    	while(right < s.length() && !isAllCharPresent(sarr, tarr)) {
	    		sarr[s.charAt(right)]++;
	    		right++;
	    	}
	    	if(isAllCharPresent(sarr, tarr) && len > right-i+1) {
	    		res = s.substring(i,right);
	    		len = right-i+1;
	    	}
	    	sarr[s.charAt(i)]--;
	    }
	    return res;
	}
	public static boolean isAllCharPresent(int[] sarr, int[] tarr) {
		for (int i=0; i<tarr.length; i++) {
			if(tarr[i] > sarr[i]) return false;
		}
		return true;
	}
}
