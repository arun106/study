package com.leetcode.math.countprimes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(10));
	}
	public static int countPrimes(int n) {
		int count = 0;
		boolean[] notPrime = new boolean[n];
		for (int i=2; i<n; i++) {
			if(notPrime[i] == false) {
				count++;
				for (int j=2; i*j < n; j++) {
					notPrime[i*j] = true;
				}
			}
		}
		return count;
    }	
}
