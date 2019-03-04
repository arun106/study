package com.udemy.sorting;

public class Selectionsort {

	public static void main(String[] args) {
		int arr[] = {5, 10, -15, 25, 1, -25, 30, 2};
		int temp = 0;
		for (int unsortedIndex = arr.length-1; unsortedIndex > 0; 
				unsortedIndex--)
		{
			temp = 0;
			for (int i=1; i<=unsortedIndex; i++)
			{
				if (arr[i] > arr[temp])
					temp = i;
			}
			swap(arr, temp, unsortedIndex);
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
