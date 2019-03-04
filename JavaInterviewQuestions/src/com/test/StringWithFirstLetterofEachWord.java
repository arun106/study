package com.test;

public class StringWithFirstLetterofEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geek for geeks";
		printFirstLetter(str);
	}

	static void printFirstLetter(String str)
	{
		String finalStr="";
		boolean spaceflag=true;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
				spaceflag=true;
			else if(spaceflag)
			{
				finalStr+=str.charAt(i);
				spaceflag=false;
			}				
		}
		System.out.println(finalStr);
	}
}
