package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args)
	{
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(birthday(s,3,2));
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
