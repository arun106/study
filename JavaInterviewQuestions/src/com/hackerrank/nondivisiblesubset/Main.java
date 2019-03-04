package com.hackerrank.nondivisiblesubset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int S[] = {3, 7, 2, 9, 1};
		int k=3;
		System.out.println(nonDivisibleSubset(k, S));
	}
	public static int nonDivisibleSubset(int k, int[] S) {
		int[] freq = new int[k];
		for (int i=0; i<S.length; i++) {
			freq[S[i] % k]++;
		}
		//k is even
		if(k%2 == 0) {
			freq[k/2] = Math.min(freq[k/2], 1);
		}
		//zero remainder
		int res = Math.min(freq[0], 1);
		//Sum the max of i, k-i values
		for (int i=1; i<=k/2; i++) {
			res+=Math.max(freq[i],freq[k-i]);
		}
		return res;
    }
}
