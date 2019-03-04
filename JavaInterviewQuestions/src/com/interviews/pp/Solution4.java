package com.interviews.pp;

public class Solution4 {

	public static void main(String[] args) {
		String str = "123454321"; 
		System.out.println(nextPalindrome(str));
	}
	public static String nextPalindrome(String str) {
		char c[] = str.toCharArray();
		int len = str.length(), mid = len/2;

		int i = mid;
		boolean flag = false;
		while (i >= 0) {
			if(c[i] < '9') {
				c[i]++;
				break;
			}
			else {
				c[i] = '0';
			}
			i--;
			if(i<0) {
				flag = true;
			}
		}
		i = mid+1;
		while (i<len) {
			c[i] = c[mid - (i-mid)];
			i++;
		}
		String res = new String(c);
		if (flag) {
			res+= "1" + res + "1";
		}
		return res;
	}
}
