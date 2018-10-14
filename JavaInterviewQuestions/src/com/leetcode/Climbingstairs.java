package com.leetcode;

public class Climbingstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Climbingstairs.climbStairs(5);
	}
	
	public static int climbStairs(int n) {
        int count = 0;
        int x=0, y=0;
        
        for (x=0; x <= n; x++)
        {
            y = n - (2 * x);
            if(y>=0 && x>=0)
                count++;
        }
        return count;
    }
}

