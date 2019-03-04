package com.hackerrank.extralongfactorial;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraLongFactorials(30);
	}
	
	static void extraLongFactorials(int n) {
        BigInteger value = new BigInteger("1");
		
        if(n > 1)
        {
        	while(n>1) {
        		value = value.multiply(new BigInteger(String.valueOf(n)));
        		n--;
        	}
        }
        
        System.out.println(value);
    }
}
