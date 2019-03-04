package com.test;

import java.util.Hashtable;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Arun", "Arun", "Arya", "Ammu", "Appu", "Aravind", "Ammu"};
		Hashtable<String,Integer> has = new Hashtable<String,Integer>();
		
		for (String s:str)
		{
			if(!has.containsKey(s))
				has.put(s, 1);
			else
			{
				int keyCount = has.get(s);
				keyCount++;
				has.put(s, keyCount);
			}
		}
		for(String s:has.keySet())
		{
			if(has.get(s)==2)
				System.out.println("Entries with count 2->" + s);
		}
	}

}
