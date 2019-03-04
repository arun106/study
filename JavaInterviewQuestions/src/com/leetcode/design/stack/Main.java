package com.leetcode.design.stack;

import java.util.ArrayList;
import java.util.List;

public class Main {
	List<Integer> list;
	int top = -1;
	
	public static void main(String[] args) {
		Main mobj = new Main();
		mobj.push(5);
		mobj.push(10);
		mobj.push(15);
		System.out.println(mobj.getMin());
		System.out.println(mobj.top());
		mobj.pop();
		System.out.println(mobj.top());
		mobj.pop();
		System.out.println(mobj.top());
		mobj.pop();
		System.out.println(mobj.top());
	}
	/** initialize your data structure here. */
    public Main() {
    	list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
        top++;
    }
    
    public void pop() {
        if(top > -1) {
        	//System.out.println(list.get(top));
        	list.remove(top);
        	top--;
        }
    }
    
    public int top() {
        if(top > -1) {
        	return list.get(top);
        }
        return -1;
    }
    
    public int getMin() {
    	int minelement = Integer.MAX_VALUE;
        if(top > -1) {
        	for(int i=0; i<list.size(); i++) {
        		if(list.get(i) < minelement) {
        			minelement = list.get(i);
        		}
        	}
        	return minelement;
        }
        return -1;
    }
}
