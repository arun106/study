package com.leetcode.arraysandstring.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",3));
	}
	public static String convert(String s, int numRows) {
		if(numRows == 1) return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
        	list.add(new StringBuilder());
        }
        boolean flag = false;
        int k = 0;
        for (int i=0; i<s.length(); i++) {
        	list.get(k).append(s.charAt(i));
        	if(!flag) {
        		k++;
        	} else {
        		k--;
        	}
        	if(k==numRows) {
        		flag = true;
        		k = k-2;
        	} else if (k==-1) {
        		flag = false;
        		k=k+2;
        	}
        }
        StringBuilder stb=new StringBuilder();
        for(StringBuilder str:list) {
        	stb.append(str);
        }
        return stb.toString();
    }
}
