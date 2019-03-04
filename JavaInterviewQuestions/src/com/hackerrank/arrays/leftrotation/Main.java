package com.hackerrank.arrays.leftrotation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int b[]= rotLeft(a, 6);
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	public static int[] rotLeft(int[] a, int d) {
		d = d%a.length;
		if (a == null || d == 0)
			return a;
		for (int rot=0; rot<d; rot++) {
			int temp = a[0];
			for (int i=1; i<a.length; i++) {
				a[i-1] = a[i];
			}
			a[a.length-1] = temp;
		}
		return a;
    }
}
