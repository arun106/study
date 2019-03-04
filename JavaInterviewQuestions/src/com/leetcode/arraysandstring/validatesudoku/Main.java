package com.leetcode.arraysandstring.validatesudoku;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] num = {
		           {'5','3','.','.','7','.','.','.','.'},
		           {'6','.','.','1','9','5','.','.','.'},
		           {'.','9','8','.','.','.','.','6','.'},
		           {'8','.','.','.','6','.','.','.','3'},
		           {'4','.','.','8','.','3','.','.','1'},
		           {'7','.','.','.','2','.','.','.','6'},
		           {'.','1','.','.','.','.','2','8','.'},
		           {'.','.','.','4','1','9','.','.','5'},
		           {'1','.','.','.','8','.','.','7','9'}
		         };
		System.out.println(isValidSudoku(num));
	}
	public static boolean isValidSudoku(char[][] board) {
		Set<String> set = new HashSet<>();
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board.length; j++) {
				if(board[i][j] != '.') {
					String str = "("+board[i][j]+")";
					if(!set.add(str+i) || !set.add(j+str) || !set.add(i/3 + str + j/3)) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
