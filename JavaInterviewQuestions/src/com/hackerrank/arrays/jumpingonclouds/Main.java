package com.hackerrank.arrays.jumpingonclouds;

public class Main {

	public static void main(String[] args) {
		//int c[] = {0,0,1,0,0,1,1,0};
		int c[] = {1,1,1,0,1,1,0,0,0,0};
		System.out.println(jumpingOnClouds(c, 3));
	}
	// Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c, int k) {
    	int output = 100, i = 0;
    	int n = c.length;
    	if(n==0)
    		return output;
    	while (output > 0) {
    		i = (i+k)%n;
    		if(c[i] == 1) {
    			output -= 3;
    		}
    		else {
    			output -= 1;
    		}
    		if (i==0)
    			break;
    	}
    	return output;
    }
}
