package com.leetcode.array.rotateimage;

public class Solution {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		/*for (int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}*/
		rotate(matrix);
	}
	public static void rotate(int[][] matrix) {
		int len = matrix.length;
        for (int i=0; i<len/2; i++) {
        	for (int j=i; j<len-i-1; j++) {
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[len-j-1][i];
        		matrix[len-j-1][i] = matrix[len-i-1][len-j-1];
        		matrix[len-i-1][len-j-1] = matrix[j][len-i-1];
        		matrix[j][len-i-1] = temp;
        	}
        }
		
		for (int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
    }
}
