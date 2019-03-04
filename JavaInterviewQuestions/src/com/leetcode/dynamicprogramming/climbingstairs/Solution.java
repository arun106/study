package com.leetcode.dynamicprogramming.climbingstairs;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(5));
	}
	public static int climbStairs(int n) {
        int res = 0;
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int nminusone = 2;
        int nminustwo = 1;
        for (int i=2; i<n; i++) {
        	res = nminusone + nminustwo;
        	nminustwo = nminusone;
        	nminusone = res;
        }
        return res;
    }
}
