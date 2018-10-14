package com.Infy;

public class InversePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = {1,3,5,4,2};
		int arr[] = {5,3,4,1,2};
		
		printInversePermutation(arr);
	}
	
	static void printInversePermutation(int[] arr)
	{
		int inv[]=new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++)
		{
			inv[arr[i]-1]=i+1;
		}
		
		for (int i:arr)
		System.out.print(i + " ");
		
		System.out.println(" ");
		
		for(int i:inv)
		System.out.print(i + " ");
	}

}
