package com.leetcode.strings.countandsay;

public class Main {

	public static void main(String[] args) {
		System.out.println(countandsay(6));
	}
	public static String countandsay(int n) {
		String str = "1", temp = "", prev = "";
		char c;
		int count = 1;
		if (n == 1) {
			return str.toString();
		}
		for (int i=2; i <= n; i++) {
			
			for (int j=0; j<str.length()-1; j++) {
				if(str.charAt(j) == str.charAt(j+1)) {
					count++;
				}
				else {
					temp += "" + count + (str.charAt(j)-48);
					count = 1;
				}
			}
			temp += "" + count + (str.charAt(str.length()-1)-48);
			count = 1;
			str = temp;
			temp = "";
		}
		return str;
	}

}
