package com.gayle.arraysandstring.uniquecharacters;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkUniqueCharacters("umbrela"));
	}
	public static boolean checkUniqueCharacters(String str) {
		boolean[] flag = new boolean[128];
		for (int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if (flag[val]) {
				return false;
			}
			flag[val] = true;
		}
		return true;
	}
}
