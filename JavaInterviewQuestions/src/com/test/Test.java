package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args)
	{
		/*List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(birthday(s,3,2));*/
		
		/*String i = "asdafd";
		String x = "asdafdasdasdsdasdfsda";
		System.out.println(i.hashCode());
		System.out.println(x.hashCode());
		
		String str = 1+2+"arya"+"soman"+5+6;
		System.out.println(str);
		System.out.println(1+2+"arya"+"soman"+5+6);
		
		StringBuilder sb = new StringBuilder();
		sb.append("XYZ");
		System.out.println(sb.charAt(1));
		
		int c =5;
		double d = 5.6;
		d = Math.round(d);
		c = (int) d;		
		System.out.println(c);*/
		
		System.out.println(Math.random());
		System.out.println(Math.random());
	}
	static int birthday(List<Integer> s, int d, int m) {
        int count=0, sum=0, prev=0, mcount = m;
        for (int i=0;i<s.size();i++)
        {    
        	System.out.println("sum"+sum);
            sum+=s.get(i);
            mcount--;
            System.out.println("mcount"+mcount);
            if (mcount == 0)
            {
                mcount++;
                if(sum == d)
                {
                    count++;
                }                
                sum-=s.get(prev);
                prev++;
            }   
        }
        return count;

    }
}
