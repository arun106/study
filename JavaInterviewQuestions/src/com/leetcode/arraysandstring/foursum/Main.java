package com.leetcode.arraysandstring.foursum;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		int A[] = {1, 2};
		int B[] = {-2, -1};
		int C[] = {-1, 2};
		int D[] = {0, 2};
		System.out.println(fourSumCount(A, B, C, D));
	}
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i=0; i<A.length; i++) {
        	for (int j=0; j<B.length; j++) {
        		int sum = A[i]+B[j];
        		if (map.containsKey(sum)) {
        			map.put(sum, map.get(sum)+1);
        		}
        		else {
        			map.put(sum, 1);
        		}
        	}
        }
        System.out.println(map);
        for (int i=0; i<C.length; i++) {
        	for (int j=0; j<D.length; j++) {
        		int sum = -1*(C[i]+D[j]);
        		if (map.containsKey(sum)) {
        			res += map.get(sum);
        		}
        	}
        }
		return res;
    }
}
