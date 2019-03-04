package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AnagramSearch {

	
	/* Driver program to test above function */
    public static void main(String args[])
    {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        search(pat, txt);
        
       /* String[] strarr={"abc","123","456"};
        ArrayList<String> s1=new ArrayList<String>();
        s1.add("1234");
        s1.add("6789");
        s1.add("aref");
        s1.add("abcd");
        Collections.sort(s1);
        System.out.println(s1);
        
        Arrays.sort(strarr);
        for(String s:strarr)
        	System.out.println(s);*/
        
        //Testing
        /*char[] chartest = {'A','C','D','X','M','B'};
        
        Arrays.sort(chartest);
        
        System.out.println(chartest);
        
        for (char c:chartest)
        	System.out.println(c);*/
        
    }
    
    static void search(String pat, String txt)
    {
    	int patl = pat.length(), txtl = txt.length();
    	
    	int[] charpat =new int[256];
    	int[] chartxt =new int[256];
    	
    	for (int i=0; i<patl; i++)
    	{
    		charpat[pat.charAt(i)]++;
    		chartxt[txt.charAt(i)]++;
    	}
    	
    	for (int i=patl; i<txtl;i++)
    	{
    		if(compareandprint(charpat,chartxt))
    		{
    			System.out.println("Match found at " + (i-patl));
    		}
    		
    		chartxt[txt.charAt(i)]++;
    		chartxt[txt.charAt(i-patl)]--;
    		
    	}
    	if(compareandprint(charpat,chartxt))
		{
			System.out.println("Match found at " + (txtl-patl));
		}
    }
    
    static boolean compareandprint(int[] charpat,int[] chartxt)
    {
    	for(int i=0; i < 256; i++)
    	{
    		if(charpat[i] != chartxt[i])
    			return false;
    	}
    	return true;
    }
}
