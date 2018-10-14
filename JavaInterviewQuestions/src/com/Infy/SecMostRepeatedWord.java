package com.Infy;

import java.util.HashMap;

public class SecMostRepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"aa", "bb", "cc", "aa", "bb", "aa", "aa", "dd"};
		printSecondMost(str);
		
	}
	
	static void printSecondMost(String[] str)
	{
		int high=0, sechigh=0;
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		
		for (String s:str)
		{
			if(hmap.containsKey(s))
			{
				int count = hmap.get(s);
				count++;
				hmap.put(s, count);
				
				if(count>high)
					high = count;
				else if(count>sechigh)
					sechigh = count;
			}
			else
				hmap.put(s,1);
		}
		
		for(String s:hmap.keySet())
		{
			if(hmap.get(s) == sechigh)
			{
				System.out.println("String with second highest count:" + s);
			}
		}
		
	}

}
