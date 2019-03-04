package com.udemy.sorting;

public class Bubblesort {

	public static void main(String[] args) {
		
		int arr[] = {5, 10, -15, 25, 1, -25, 30, 2};
		for (int unsortedPartition = arr.length-1; unsortedPartition > 0; 
				unsortedPartition--)
		{
			for (int i=0; i<unsortedPartition; i++)
			{
				if(arr[i]>arr[i+1])
				{
					swap(arr,i,i+1);
				}
			}
		}
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public static void swap(int a[], int i, int j)
	{
		if(i==j)
			return;
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
