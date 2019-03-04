package com.hackerrank.strings.commonchild;
/*
 * Dynamic programming
 * Longest common subsequence
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(commonChild("HARRY", "SALLY"));
	}
	public static int commonChild(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int l1 = s1.length(), l2 = s2.length();
		int matrix[][] = new int[l1+1][l2+1];
		for(int i = 0; i <= l1; i++ ){
	        for(int j = 0; j <= l2; j++ ){
	            if(i == 0 || j == 0){
	            	matrix[i][j] = 0;
	            } else if(c1[i-1]==c2[j-1]){
	            	matrix[i][j] = 1 + matrix[i-1][j-1];
	            } else{
	            	matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);
	            }
	        }
	    }
		for(int i = 0; i <= l1; i++ ){
	        for(int j = 0; j <= l2; j++ ){
	        	System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
		}
	    return matrix[l1][l2];
		//return commonChild(c1, c2, l1, l2); //This will also work, time is more
    }
	/*public static int commonChild(char[] c1, char[] c2, int l1, int l2) {
		if(l1==0 || l2 == 0) {
			return 0;
		}
		if (c1[l1-1] == c2[l2-1]) {
			return 1+commonChild(c1,c2,l1-1,l2-1);
		} else {
			return Math.max(commonChild(c1,c2,l1-1,l2), commonChild(c1,c2,l1,l2-1));
		}
	}*/
}
