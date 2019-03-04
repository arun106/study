package com.test;

import java.util.HashMap;
import java.util.Map;

public class Anagrammap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "EBACDGABCDA!#$%";
        String pat = "BCADAGBCADE%$#!";
        System.out.println(search(pat, txt));
	}
	public static boolean search(String pat, String txt)
    {
    	Map<Character,Integer> map1 = new HashMap<>();
		
    	for(int i=0; i<pat.length(); i++)
    	{
    		if(!map1.containsKey(pat.charAt(i)))
    			map1.put(pat.charAt(i), 1);
    		else
    		{
    			int count=map1.get(pat.charAt(i));
    			count++;
    			map1.put(pat.charAt(i), count);
    		}
    	}
    	for(int i=0; i<txt.length(); i++)
    	{
    		if(!map1.containsKey(txt.charAt(i)))
    			return false;
    		else
    		{
    			int count=map1.get(txt.charAt(i));
    			count--;
    			map1.put(txt.charAt(i), count);
    		}
    	}
    	for(Character ch:map1.keySet())
    	{
    		if(map1.get(ch) != 0)
    			return false;
    	}
    	return true;
    }
    
    
}
