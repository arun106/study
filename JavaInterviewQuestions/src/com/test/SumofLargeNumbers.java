package com.test;

public class SumofLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "90010", str2="10102";
		sum(str1, str2);
		
	}
	
	static void sum(String str1, String str2)
	{
		int carry=0, str1len= str1.length(), str2len= str2.length(), sum=0, rem=0;
		
		int i=str1len-1, j=str2len-1;
		String output="";
		
		while(i>=0 && j>=0)
		{
			sum = Character.getNumericValue(str1.charAt(i))+Character.getNumericValue(str2.charAt(j))+carry;
			carry = sum / 10;
			rem = sum % 10;
			output=rem+output;
			i--; j--;
		}
		if(i>=0)
		{
			while(i >= 0)
			{
				sum= Character.getNumericValue(str1.charAt(i)) + carry;
				carry = 0;
				output = sum+output;
				i--;
			}
		}
		else if(j>=0)
		{
			while(j >= 0)
			{
				sum= Character.getNumericValue(str2.charAt(j)) + carry;
				carry = 0;
				output = sum+output;
				j--;
			}
		}
		if(carry > 0)
			output = carry + output;
		
		System.out.println(str1 + " + " + str2 + " = " + output);

	}

}
