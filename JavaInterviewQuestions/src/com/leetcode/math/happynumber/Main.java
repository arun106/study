package com.leetcode.math.happynumber;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}
	public static boolean isHappy(int n) {
        int sum = 0;
		ArrayList<Integer> list = new ArrayList();
        int i = n;
		while (!list.contains(i)) {
			list.add(i);
			sum = 0;
			while (i>0) {
				int x = i%10;
				i=i/10;
				sum+=Math.multiplyExact(x, x);
			}
			i=sum;
			if (i == 1) {
				return true;
			}
			System.out.println(list);
		}
		return false;
    }
}
