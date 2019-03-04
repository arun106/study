package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Test");
		
		//read input from stdin
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, LinkedList<String>> depend = new LinkedHashMap<String, LinkedList<String>>();
        LinkedList<String> installist = new LinkedList<String>();

        while (true) {
            String line = scan.nextLine();
            String newline = line.trim().replaceAll(" +", " ");
            //Split the input string to array
            String[] inputarr = newline.split(" ");
            
            //no action for empty input
            if (line == null || line.length() == 0) {
                continue;
            }
            //the END command to stop the program
            if ("END".equals(line)) {
                System.out.println("END");
                break;
            }
            //Please provide your implementation here
            //Implementation for DEPEND
            else if ("DEPEND".equals(inputarr[0])) {
                System.out.println(line);
                for (int i=2; i<inputarr.length; i++)
                {
                	if(depend.containsKey(inputarr[i]))
                	{
                		if(depend.get(inputarr[i]).contains(inputarr[1]))
                		{
                			System.out.println(inputarr[i]+" depends on "+inputarr[1]+", ignoring command");
                			break;
                		}
                	}
                	if(depend.containsKey(inputarr[1]))
                	{
                		depend.get(inputarr[1]).add(inputarr[i]);
                	}
                	else
                	{
                		LinkedList<String> li = new LinkedList<String>();
                		li.add(inputarr[i]);
                		depend.put(inputarr[1], li);
                	}
                }
                //System.out.println(depend);
            }
            //Implementation for INSTALL
            else if ("INSTALL".equals(inputarr[0])) {
            	System.out.println(line);
                if(installist.contains(inputarr[1]))
                {
                	System.out.println(inputarr[1]+" is already installed");
                }
                else if(depend.containsKey(inputarr[1]))
                {
                	for(String install:depend.get(inputarr[1]))
                	{
                		if(!installist.contains(install))
                		{
                			System.out.println("Installing "+install);
                			installist.add(install);
                		}
                	}
                	System.out.println("Installing "+inputarr[1]);
                	installist.add(inputarr[1]);
                }
                else
                {
                	System.out.println("Installing "+inputarr[1]);
                	installist.add(inputarr[1]);
                }
            }
            //Implementation for REMOVE
            else if ("REMOVE".equals(inputarr[0])) {
            	System.out.println(line);
                boolean flag = true;
            	for (String str:depend.keySet())
            	{
            		if(installist.contains(str) && depend.get(str).contains(inputarr[1]))
            		{
            			System.out.println(inputarr[1]+" is still needed");
            			flag = false;
            			break;
            		}
            	}
            	if(flag)
            	{
	                if(!installist.contains(inputarr[1]))
	                {
	                	System.out.println(inputarr[1]+" is not installed");
	                }
	                else
	                {
	                	System.out.println("Removing "+inputarr[1]);
	                	installist.remove(inputarr[1]);
	                	boolean removeflag = false;
	                	if (depend.containsKey(inputarr[1])){
	                		for (String str:depend.get(inputarr[1]))
	                    	{
	                			removeflag = true;
	                			for(String strval:depend.keySet())
	                			{
	                				if(depend.get(strval).contains(str) && installist.contains(strval))
	                				{
	                					removeflag = false;
	                					break;
	                				}
	                			}
	                			if(removeflag)
	                			{
	                				System.out.println("Removing "+str);
		                        	installist.remove(str);
	                			}
	                    	}
	                	}
	                }
            	}
            }
            //Implementation for LIST
            else if ("LIST".equals(inputarr[0])) {
                System.out.println("LIST");
                for (String str:installist)
                	System.out.println(str);
            }
            
        }

	}

}
