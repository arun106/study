package com.salesforce;

import java.util.Arrays;

public class SortedAdjacentSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,3,5};
		
		boolean flag = isswapsortpossible(arr);
		if(flag)
			System.out.println("Sorting is possible by swapping adjacent elements");
		else
			System.out.println("Sorting is not possible by swapping adjacent elements");
	}
	
	public static boolean isswapsortpossible(int[] arr){
		
		int[] sortedarr = new int[arr.length];
		System.arraycopy(arr, 0, sortedarr, 0, arr.length);
		int temp=0;
		Arrays.sort(sortedarr);
		
		for (int i=0; i<arr.length-1; i++)
		{
			if (arr[i] > arr[i+1])
			{
				temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			if(isarraysame(arr,sortedarr))
				return true;
		}
		return false;
	}
	
	public static boolean isarraysame(int[] arr1, int[] arr2)
	{
		for (int i=0; i< arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

}
