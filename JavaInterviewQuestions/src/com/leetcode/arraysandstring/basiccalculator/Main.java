package com.leetcode.arraysandstring.basiccalculator;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		System.out.println(calculate("1+7*2*2+1+1-1*2"));
	}
	public static int calculate(String s) {
		int output = 0;
		Stack<Integer> stack = new Stack<>();
		int i=0;
		char symbol = ' ';
		int num = 0;
		while (i<s.length()) {
			char c = s.charAt(i);
			if(c == ' ') {
				//Do nothing
			}
			else if (Character.isDigit(c)) {
				num = num*10+(c-48);
			}
			else {
				processSymbol(symbol,c,stack,num);
				symbol = c;
				num=0;
			}
			i++;
			if (i == s.length()) {
				processSymbol(symbol,c,stack,num);
			}
		}
		while (!stack.isEmpty()) {
			output += stack.pop();
		}
		return output;
	}
	public static void processSymbol(char symbol, char c, Stack<Integer> stack, int num) {
		if (symbol == '-') {
			stack.push(num*-1);
		}
		else if (symbol == '*') {
			int prevnum = stack.pop();
			stack.push(prevnum*num);
		}
		else if (symbol == '/') {
			int prevnum = stack.pop();
			stack.push(prevnum/num);
		}
		else {
			symbol = c;
			stack.push(num);
		}
	}
}
