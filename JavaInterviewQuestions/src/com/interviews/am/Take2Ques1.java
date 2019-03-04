package com.interviews.am;

import java.util.*;

public class Take2Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static List<List<Integer>> sol(int numDestinations, 
            List<List<Integer>> allLocations,
            int numDeliveries)
	{
		List<List<Integer>> li = new ArrayList<List<Integer>>();
        TreeMap<Double,List<ArrayList<Integer>>> dmap = new TreeMap<Double,List<ArrayList<Integer>>>();
        double dist = 0;
        int x=0, y=0;
        
        for (int i=0; i<numDestinations; i++)
        {
            x=allLocations.get(i).get(0);
            y=allLocations.get(i).get(1);
            
            dist = Math.sqrt((x*x) + (y*y));
            if(dmap.containsKey(dist))
            {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(x);
                al.add(y);
                dmap.get(dist).add(al);
            }
            else
            {
            	ArrayList<ArrayList<Integer>> alli = new ArrayList<ArrayList<Integer>>();
            	ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(x);
                al.add(y);
                alli.add(al);
                dmap.put(dist,alli);;
            }
        }
        
        for(Double d:dmap.keySet())
        {
        	for(int i=0; i<dmap.get(d).size();i++)
        	{
        		if(numDeliveries>0)
        		{
        			ArrayList<Integer> al = new ArrayList<Integer>();
        			al.add(dmap.get(d).get(i).get(0));
        			al.add(dmap.get(d).get(i).get(1));
        			numDeliveries--;
        			li.add(al);
        		}
        		else
        		{
        			break;
        		}
        	}
        	if(numDeliveries==0)
    		{
        		break;
    		}
        }
        return li;
	}

}
