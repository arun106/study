package com.leetcode.arraysandstring.setmatrixzeros;

import java.util.Set;
import java.util.TreeSet;

/*
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(nums);
	}
	public static void setZeroes(int[][] matrix) {
        int x = matrix.length, y=0;
        Set<Integer> rowset = new TreeSet();
        Set<Integer> colset = new TreeSet();
        
        if(x > 0) {
        	y=matrix[0].length;
        }
        for (int i=0; i<x; i++) {
        	for (int j=0; j<y ; j++) {
        		if(matrix[i][j] == 0) {
        			rowset.add(i);
        			colset.add(j);
        		}
        	}
        }
        System.out.println(rowset + " " + colset);
        for (int ix:rowset) {
        	for(int i=0; i<y; i++) {
        		matrix[ix][i] = 0;
        	}
        }
        for (int iy:colset) {
        	for(int i=0; i<x; i++) {
        		matrix[i][iy] = 0;
        	}
        }
        for (int i=0; i<x; i++) {
        	for (int j=0; j<y ; j++) {
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
