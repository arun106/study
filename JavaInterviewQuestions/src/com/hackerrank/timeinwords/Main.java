package com.hackerrank.timeinwords;

public class Main {

	public static void main(String[] args) {
		System.out.println(timeInWords(5,00));
		System.out.println(timeInWords(5,01));
		System.out.println(timeInWords(5,10));
		System.out.println(timeInWords(5,15));
		System.out.println(timeInWords(5,30));
		System.out.println(timeInWords(5,40));
		System.out.println(timeInWords(5,45));
		System.out.println(timeInWords(5,47));
		System.out.println(timeInWords(5,28));
		
		
	}
	public static String timeInWords(int h, int m) {
		String str = "";
		String minute[] = {"", "one","two","three","four","five","six","seven","eight","nine","ten","eleven",
				"twelve","thirteen","forteen","","sixteen","seventeen","eighteen","nineteen","twenty",
				"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
				"twenty eight","twenty nine"};
		
		if (h>0 && h<=12) {
			if(m == 00) {
				str = minute[h]+" o' clock";
			}
			else if(m == 15) {
				str = "quarter past "+minute[h];
			}
			else if(m == 30) {
				str = "half past "+minute[h];
			}
			else if(m == 45) {
				str = "quarter to "+minute[(h+1)%12];
			}
			else if(m < 10){
				str = minute[m]+" minute past "+minute[h];
			}
			else if(m < 30){
				str = minute[m]+" minutes past "+minute[h];
			}
			else if(m < 50) {
				str = minute[60-m]+" minutes to "+minute[(h+1)%13];
			}
			else {
				str = minute[60-m]+" minutes to "+minute[(h+1)%13];
			}
		}
		else
		{
			return "";
		}
		return str;
    }
}
