package com.leetcode.arraysandstring.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//int a[][] = {{1,2,3},{4,5,6},{7,8,9}}; // 1, 2, 3, 6, 9, 8, 7, 4, 5
		//int a[][] = {{1,2},{3,4}}; // 1, 2, 3, 6, 9, 8, 7, 4, 5
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; // 1, 2, 3, 6, 9, 8, 7, 4, 5
		//int a[][] = {{1},{2}}; 
		//0,0 0,1 0,2 1,2 2,2 2,1 2,0 1,0 1,1
		System.out.println(spiralOrder(a));
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		int rowEnd = matrix.length-1;
		if(rowEnd <= 0)
			return null;
		int colEnd = matrix[0].length-1;
		List<Integer> li = new ArrayList<Integer>();
		int rowBegin=0, colBegin = 0;
		while (rowBegin <= rowEnd && colBegin <= colEnd) {
			for (int i=colBegin; i<=colEnd; i++) {
				li.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			for (int i=rowBegin; i<=rowEnd; i++) {
				li.add(matrix[i][colEnd]);
			}
			colEnd--;
			if (rowBegin <= rowEnd) {
				for (int i=colEnd; i>=colBegin; i--) {
					li.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;
			if (colBegin <= colEnd) {
				for (int i=rowEnd; i>=rowBegin; i--) {
					li.add(matrix[i][colBegin]);
				}
			}
			colBegin++;
		}
        return li;
    }
}
