package com.Infy;

public class RemovePalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Text contains malayalam and level words";
		System.out.println(removePalindromeWords(str));
	}
	
	static String removePalindromeWords(String str)
	{
		String finalword="", curword="";
		str += " ";
		int length = str.length();
		
		for(int i=0; i<length; i++)
		{
			if(str.charAt(i) != ' ')
				curword += str.charAt(i);
			else
			{
				if(!isPalindrome(curword))
				{
					finalword += curword + " ";
				}
				curword = "";
			}
			
		}
		
		return finalword;
	}
	
	static boolean isPalindrome(String word)
	{
		int i=0, j=word.length()-1;
		
		while (i<j)
		{
			if(word.charAt(i) != word.charAt(j))
				return false;
			
			i++; j--;
		}
		return true;
	}
}
