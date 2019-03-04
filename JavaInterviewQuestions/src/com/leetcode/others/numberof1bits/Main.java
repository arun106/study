package com.leetcode.others.numberof1bits;

public class Main {

	public static void main(String[] args) {
		System.out.println(hammingWeight(7));
		//System.out.println(1>>>1);
	}
	public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0) {
        	res = res + (n & 1);
    		n = n>>>1;
    	}
    	return res;
    }
}
