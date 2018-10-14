package com.Infy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeastFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={2,3,4,4,5,5,1,1,2};

		Arrays.sort(array);
		System.out.println(leastFrequent(array));
		
		System.out.println("Hash - "+leastFrequentHash(array));
		
		
	}
	static int leastFrequent(int[] array)
	{
		int least=array[0],mincount=array.length,currcount=1;
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==array[i-1])
			{
				currcount++;
			}
			else
			{
				if(currcount<mincount)
				{
					mincount=currcount;
					least=array[i-1];
					//System.out.println("least"+least);
				}
				currcount=1;
			}
		}
		if(currcount<mincount)
		{
			mincount=currcount;
			least=array[array.length-1];
			//System.out.println("least"+least);
		}
		System.out.println("least"+least);
		return least;
	}

	
	static int leastFrequentHash(int[] array)
	{
		int least=array[0],mincount=array.length;
		Map<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			if(countMap.containsKey(array[i]))
			{
				int freq=countMap.get(array[i]);
				freq++;
				countMap.put(array[i], freq);
			}
			else
				countMap.put(array[i], 1);
		}
		
		//or use this
		//for(Map.Entry<Integer, Integer> key:countMap.entrySet())
		//for (Integer key:countMap.keySet())
		
		for(Entry<Integer, Integer> key:countMap.entrySet())
		{
			if(key.getValue()<mincount)
			{
				least=key.getKey();
				mincount=key.getValue();
			}
		}
		
		System.out.println("least"+least);
		return least;
	}
	
}
