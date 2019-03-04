package com.interviews.pp;

import java.util.Arrays;

public class Solution3 {

	public static void main(String[] args) {
		System.out.println(variantsCount(3,2,3,3,2,15));
	}
	public static long variantsCount(int n, int s0, int k, int b, int m, long a) {
		long s[] = new long[n];
        long res = 0;
        // Set<Integer> set = new TreeSet<>();
        s[0] = s0;
        // set.add(s0);
        for (int i = 1; i < n; i++) {
            s[i] = (((k * s[i - 1]) + b) % m) + 1 + s[i - 1];
            // set.add(s[i]);
        }
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < s.length) {
            j = 0;
            if ((s[i] * s[j]) > a) {
                break;
            }
            while (j < s.length) {
                if ((s[i] * s[j]) <= a) {
                    res++;
                } else {
                    break;
                }
                j++;
            }
            i++;
        }
        return res;
	}
	
}
