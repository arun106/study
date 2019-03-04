package com.hackerrank.implementation.repeatedstring;

public class Main {

	public static void main(String[] args) {
		System.out.println(repeatedString("a",1000000000000l));
	}
	public static long repeatedString(String s, long n) {
        long len = s.length(), rem = 0;
        long counta = 0, res = 0;
        
        for (int i=0; i<len; i++) {
        	if(s.charAt(i) == 'a') {
        		counta++;
        	}
        }
        res = (n/len)*counta;
        rem = n%len;
        for (int i=0; i<rem; i++) {
        	if(s.charAt(i) == 'a') {
        		res++;
        	}
        }
        return res;
    }
}
