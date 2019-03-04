package com.gayle.arraysandstring.matrixrotate90;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixrotate90(matrix, 4);
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] matrixrotate90(int[][] matrix, int n) {
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
		return matrix;
	}
}
