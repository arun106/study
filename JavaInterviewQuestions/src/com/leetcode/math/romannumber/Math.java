package com.leetcode.math.romannumber;

public class Math {

	public static void main(String[] args) {
		/* 
		 * Symbol       Value
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
		 * 
		 * */
		System.out.println(romanToInt("MCMXCIV"));
	}
	public static int romanToInt(String s) {
        int sum = 0;
        if (s==null || s.length() == 0) {
        	return 0;
        } if (s.indexOf("IV") >= 0) {
        	sum-=2;
        } if (s.indexOf("IX") >= 0) {
        	sum-=2;
        } if (s.indexOf("XC") >= 0) {
        	sum-=20;
        } if (s.indexOf("XL") >= 0) {
        	sum-=20;
        } if (s.indexOf("CD") >= 0) {
        	sum-=200;
        } if (s.indexOf("CM") >= 0) {
        	sum-=200;
        }
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'M') {
        		sum+=1000;
        	} else if (s.charAt(i) == 'D') {
        		sum+=500;
        	} else if (s.charAt(i) == 'C') {
        		sum+=100;
        	} else if (s.charAt(i) == 'L') {
        		sum+=50;
        	} else if (s.charAt(i) == 'X') {
        		sum+=10;
        	} else if (s.charAt(i) == 'V') {
        		sum+=5;
        	} else if (s.charAt(i) == 'I') {
        		sum+=1;
        	} 
        }
        
        return sum;
    }

}
