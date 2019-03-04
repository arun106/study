package com.leetcode.math.powerofthree;

public class Main {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(18));
	}
	
	public static boolean isPowerOfThree(int n) {
		if (n <= 0)
			return false;
		else if (n == 1)
			return true;
        while (n > 1) {
        	if (n%3 == 0) {
        		n = n/3;
        	}
        	else
        		return false;
        }
		return true;
    }
}
