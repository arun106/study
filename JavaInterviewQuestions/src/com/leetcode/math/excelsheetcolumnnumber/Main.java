package com.leetcode.math.excelsheetcolumnnumber;

public class Main {

	public static void main(String[] args) {
		System.out.println(titleToNumber("BB"));
	}
	
	public static int titleToNumber(String s) {
        int sum = 0;
        for (int i=s.length()-1; i>=0; i--) {
        	int ch = s.charAt(i) - 'A' + 1;
        	sum += ch * Math.pow(26, (s.length()-1-i)); 
        }
		return sum;
    }
}
