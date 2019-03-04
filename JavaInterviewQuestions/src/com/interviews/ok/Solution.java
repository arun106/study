package com.interviews.ok;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ques[]={"bella 0","bella 15","bella 59","bella 59","bella 60","bella 62","bella 80","bella 120",
				"bella 180","bella 240",
				"erica 0","erica 60","erica 120","erica 180","erica 240","erica 320"};
		
		String str[] = solution(ques,3);
		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
	}
	
	public static String[] solution(String[] A, int Y)
	{
		String[] split = null;
		int key = 0, value = 0;
		boolean blocked = false;
		Map<String,HashMap<Integer,Integer>> request = new LinkedHashMap<String, HashMap<Integer,Integer>>();
		Map<Integer,Integer> countmap = null, totalreq = null;
		totalreq = new HashMap<Integer,Integer>();
		for (String s:A)
		{
			split = s.split(" ");
			key = Integer.parseInt(split[1])/60;
			blocked = false;
			if(request.containsKey(split[0]))
			{
				countmap = request.get(split[0]);
				if(countmap.containsKey(key))
				{
					value = countmap.get(key);
					value++; 
					if(value <= Y)
					{
						countmap.put(key, value);
					}
					else
						blocked = true;
				}
				else
				{
					countmap.put(key, 1);
				}
				
			}
			else
			{
				HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
				count.put(key,1);
				request.put(split[0], count);
			}
			if(blocked)
				continue;
			if(totalreq.containsKey(key))
			{
				int count = totalreq.get(key);
				count++;
				totalreq.put(key, count);
			}
			else
			{
				totalreq.put(key, 1);
			}
		}
		
		String[] ans = new String[request.size()];
		int i = 0, count = 0, sum = 0, sumc=0, black = 0;
		for (Map.Entry<String, HashMap<Integer,Integer>> m:request.entrySet())
		{
			String name = m.getKey();
			count = 0; black=0;
			
			for(Map.Entry<Integer, Integer> n:m.getValue().entrySet())
			{
				sum = 0; sumc=0;
				if(black > 0)
					black--;
				for (int j=0; j<5; j++)
				{
					if(totalreq.containsKey(n.getKey()-j))
						sum+=totalreq.get(n.getKey()-j);
					if(m.getValue().containsKey(n.getKey()-j))
						sumc+=m.getValue().get(n.getKey()-j);
				}
				if((sumc > (.5d*sum) && sum>10))
					black = 2;
				else
					count +=n.getValue();
			}
			ans[i] = name+" "+count;
			i++;
		}
		return ans;
	}

}
