package com.test;

import java.util.Stack;

public class SpecialStackNew extends Stack<Integer>
{
	    Stack<Integer> stack = new Stack<>();
	     
	    /* SpecialStack's member method to insert an element to it. This method
	    makes sure that the min stack is also updated with appropriate minimum
	    values */
	    void push(int x)
	    {
	    	System.out.println("Push operation!!");

	        if(stack.isEmpty())
	        {
	            //super.push(x);
	        	stack.push(x);
	        }
	        else
	        {
	            //super.push(x);
	            int y = stack.pop();
	            if(x < y)
	            {
	            	System.out.println("Push x<y");
	            	stack.push(y);
	            	stack.push(x);
	            }
	            else
	            {
	            	System.out.println("Push x>y");

	            	push(x);
	            	stack.push(y);
	            }
	        }
	    }
	 
	    /* SpecialStack's member method to insert an element to it. This method
	    makes sure that the min stack is also updated with appropriate minimum
	    values */
	    public Integer pop()
	    {
	    	if(!stack.isEmpty())
	    	{
		        //int x = super.pop();
		        int x = stack.pop();
		        return x;
	    	}
	    	else
	    	{
	    		System.out.println("Stack empty");
	    		return -99;
	    	}
	    }
	 
	    /* Driver program to test SpecialStack methods */
	    public static void main(String[] args) 
	    {
	        SpecialStackNew s = new SpecialStackNew();
	        
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        //System.out.println(s.getMin());
	        s.push(5);
	        s.push(35);
	        s.push(3);
	        //System.out.println(s.getMin());
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.pop());
	        System.out.println(s.pop());

	        
	    }
}
