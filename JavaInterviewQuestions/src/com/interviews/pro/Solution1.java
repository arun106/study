package com.interviews.pro;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(solution("helloworld"));
	}
	public static char solution(String str) {
		int count[] = new int[256];
		int n = str.length(), max = 0;
		char c = ' ';
		for (int i=0; i<n; i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0; i<n; i++) {
			if(count[str.charAt(i)] > max) {
				max = count[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		return c;
	}
}
