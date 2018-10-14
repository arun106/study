package com.Infy;

public class ChunkedPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "ghiabcdefhelloadamhelloabcdefghi";
		//String str = "merchant";
		//String str = "antaprezatepzapreanta";
		String str = "geeksforgeeks";

		int count=checkChunkedPalindrome(str);
		
		System.out.println("Number of chunked palindromes: "+count);
	}

	static int checkChunkedPalindrome(String str)
	{
		int count = 0, i = 0, j = str.length()-1;
		
		String start ="", end ="";
		
		while (i < j)
		{
			start += str.charAt(i);
			end = str.charAt(j) + end;
			
			if(start.equals(end))
			{
				count=count+2;
				start = end = "";
			}
			i++; j--;
		}
		if(!(start.equals("") || end.equals("")))
			count++;
		return count;
	}
	
}
