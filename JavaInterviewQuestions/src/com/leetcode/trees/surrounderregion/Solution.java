package com.leetcode.trees.surrounderregion;

import java.util.Stack;

public class Solution {
	static class Pair {
		public int x;
		public int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		char[][] board = {{'X','X','X','X'},
						  {'X','O','O','X'},
						  {'X','X','O','X'},
						  {'X','O','X','X'}};
		solve(board);
	}
	public static void solve(char[][] board) {
		int lenx = board.length;
		if (lenx == 0) return;
		int leny = board[0].length;
        for (int i=0; i<lenx; i++) {
        	if(board[i][0] == 'O') {
        		markUnflippable(board, i, 0);
        	}
        }
        for (int i=0; i<leny; i++) {
        	if(board[0][i] == 'O') {
        		markUnflippable(board, 0, i);
        	}
        }
        for (int i=0; i<lenx; i++) {
        	if(board[i][leny-1] == 'O') {
        		markUnflippable(board, i, leny-1);
        	}
        }
        for (int i=0; i<leny; i++) {
        	if(board[lenx-1][i] == 'O') {
        		markUnflippable(board, lenx-1, i);
        	}
        }
        for(int i=0; i<lenx; i++) {
			for (int j=0; j<leny; j++) {
				if(board[i][j] == 'U') {
					board[i][j] = 'O';
				} else if(board[i][j] == 'O') {
					board[i][j] = 'X';
				} 
			}
        }
				
        for(int i=0; i<lenx; i++) {
			for (int j=0; j<leny; j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}
    }
	public static void markUnflippable(char[][] board, int x, int y) {
		int[] X = {-1, 0, 1, 0};
		int[] Y = {0, 1, 0, -1};
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(x,y));
		int lenx = board.length;
		while(!stack.isEmpty()) {
			Pair p = stack.pop();
			board[p.x][p.y] = 'U';
			for(int i=0; i<X.length; i++) {
				if(p.x+X[i]>=0 && p.x+X[i]<lenx && p.y+Y[i] >=0 && p.y+Y[i]<board[p.x+X[i]].length
						&& board[p.x+X[i]][p.y+Y[i]] == 'O') {
					stack.push(new Pair(p.x+X[i],p.y+Y[i]));
				}
			}
		}
	}
}
