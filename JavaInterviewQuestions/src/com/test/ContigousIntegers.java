package com.test;

import java.util.*;
import java.lang.*;
import java.io.*;

class ContigousIntegers {
	public static void main (String[] args) {
		System.out.print("Enter the integer:");
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int a=s.nextInt();
	        int arr[]=new int[a];
	        for(int j=0;j<a;j++)
	        {
	            arr[j]=s.nextInt();
	        }
	        Arrays.sort(arr);
	        int ans=0;
	        //System.out.println(arr[0]);
	        //System.out.println(arr[arr.length-1]);
	        for(int j=arr[0];j<arr[arr.length-1];j++)
	        {
	            int an1=0;
	            for(int k=0;k<a;k++)
	            {
	                
	                if(j!=arr[k])
	                {
	                   an1++; 
	                }
	            }
	            if(an1==a)
	            {
	                ans=1;
	                break;
	            }
	        }
	        if(ans==0)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
	
	}
}
