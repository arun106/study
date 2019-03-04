package com.interviews.am;

import java.util.*;

public class Take2Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static List<List<Integer>> optimalUtilization(int maxTravelDist, 
            List<List<Integer>> forwardRouteList,
            List<List<Integer>> returnRouteList)
	{
		List<List<Integer>> li = new ArrayList<List<Integer>>();
	    int dist = 0, temp=0;
	    Integer x = 0, y=0;
	    TreeMap<Integer,List<ArrayList<Integer>>> dmap = new TreeMap<Integer,List<ArrayList<Integer>>>();
	    //Iterating through forward list
	    for (int i=0; i<forwardRouteList.size(); i++)
	    {
	    	 //Iterating through return list
	    	for(int j=0; j<returnRouteList.size(); j++)
	    	{
	    		temp = forwardRouteList.get(i).get(1)+returnRouteList.get(j).get(1);
	    		if(temp>dist && temp<=maxTravelDist)
	    		{
	    			//Saving in temp variable
	    			dist=temp;
	    		}
	    	}
	    }
	    
	    for (int i=0; i<forwardRouteList.size(); i++)
	    {
	    	for(int j=0; j<returnRouteList.size(); j++)
	    	{
	    		temp = forwardRouteList.get(i).get(1)+returnRouteList.get(j).get(1);
	    		if(temp == dist)
	    		{
	    			ArrayList<Integer> al = new ArrayList<Integer>();
	    			al.add(forwardRouteList.get(i).get(0));
	    			al.add(returnRouteList.get(j).get(0));
	    			li.add(al);
	    		}
	    	}
	    }
		return li;
		
	}

}
