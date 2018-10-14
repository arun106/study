package com.Infy;

import java.util.Stack;

public class ReverseWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Arun";
		
		str = " "+str;
		
		String word = "", finalword= "";
		
		for (int i=str.length() - 1; i>=0; i--)
		{
			if(str.charAt(i) != ' ')
				word = str.charAt(i) + word;
			else
			{
				finalword += word + " ";
				word = "";
			}
		}
		System.out.println(finalword);
		
		System.out.println("Finalword using stack - ");
		reverseprint(str);
	}
	static void reverseprint(String str)
	{
		Stack <Character> stk = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				stk.push(str.charAt(i));
			else
			{
				while(!stk.empty())
				{
					System.out.print(stk.pop());
				}
				System.out.print(' ');
			}
		}
		while(!stk.empty())
		{
			System.out.print(stk.pop());
		}
	}

}
