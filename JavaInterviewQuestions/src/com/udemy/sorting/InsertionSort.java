package com.udemy.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5, 10, -15, 25, 1, -25, 30, 2};
		int i = 0;
		for (int firstUnsortedIndex=1; firstUnsortedIndex<arr.length; firstUnsortedIndex++)
		{
			int newElement = arr[firstUnsortedIndex];
			for(i=firstUnsortedIndex; i>0; i--)
			{
				if(arr[i-1] > newElement)
				{
					arr[i]=arr[i-1];
				}
				else
				{
					break;
				}
			}
			arr[i]=newElement;
		}
		
		for (i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		
	}
	

}
