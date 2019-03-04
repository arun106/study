package com.gayle.arraysandstring.replacespaces;

public class Main {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		removeSpaces(str.toCharArray(), 13);
	}
	public static void removeSpaces(char[] ch, int n) {
		int index = ch.length;
		for (int i=n-1; i>=0; i--) {
			if (ch[i] == ' ') {
				ch[index-1] = '0';
				ch[index-2] = '2';
				ch[index-3] = '%';
				index = index-3;
			}
			else {
				ch[index-1] = ch[i];
				index--;
			}
		}
		System.out.println(String.valueOf(ch));
	}
}
