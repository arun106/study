package com.gayle.arraysandstring.oneeditaway;

public class Main {

	public static void main(String[] args) {
		System.out.println(oneEditAway("pale", "ple"));
	}
	public static boolean oneEditAway(String first, String second) {
		if(Math.abs(first.length()-second.length()) > 1)
			return false;
		String s1 = first.length() < second.length()? first : second;
		String s2 = first.length() < second.length()? second : first;
		int i=0, j=0;
		boolean flag = false;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				if (flag) {
					return false;
				}
				flag = true;
				if (s1.length() == s2.length()) {
					i++;
				}
			}
			else {
				i++;
			}
			j++;
		}
		return true;
	}
}
