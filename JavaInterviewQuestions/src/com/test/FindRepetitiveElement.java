package com.test;

import java.util.Arrays;

public class FindRepetitiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={1,2,3,4,5,3};

		Arrays.sort(array);
		for (int i=0;i<array.length-1;i++)
		{
			if(array[i]==array[i+1])
				System.out.println(array[i]+" is repeating!");
		}
	}

}
