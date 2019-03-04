package com.leetcode.others.validparanthesis;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]}"));
	}
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(c=='[' || c=='{' || c=='(') {
        		stack.push(c);
        	} else if (c== ']' || c=='}' || c==')') {
        		if(!stack.isEmpty()) { 
        			char cprev = stack.pop();
        			if ((c==']' && cprev=='[') || (c=='}' && cprev=='{')
        					|| (c==')' && cprev=='(')) {
        				continue;
        			}
        			else {
        				return false;
        			}
        		}
        		else {
        			return false;
        		}
        	}
        }
        if(stack.isEmpty())
        	return true;
        return false;
    }
}
