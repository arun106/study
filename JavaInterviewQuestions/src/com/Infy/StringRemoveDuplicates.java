package com.Infy;

import java.util.ArrayList;

public class StringRemoveDuplicates {

	private ArrayList<String> aList;

	public static void main(String[] args) {
		
		String s="HappyNewYear", g="";
		for (int i=0;i<s.length();i++)
		{
			CharSequence sq=String.valueOf(s.charAt(i));
			if(!g.contains(sq))
			{
				g=g.concat(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println("Output "+g);
		
	}

}
