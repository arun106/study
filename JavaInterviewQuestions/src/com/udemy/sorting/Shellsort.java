package com.udemy.sorting;

public class Shellsort {

	public static void main(String[] args) {
		int arr[] = {5, 10, -15, 25, 1, -25, 30, 2};
		
		for(int gap=arr.length/2; gap>0; gap--)
		{
			for(int i=gap; i < arr.length; i++)
			{
				int newElement = arr[i];
				int j = i;
				
				while(j >= gap && arr[j-gap] > newElement)
				{
					arr[j] = arr[j-gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
		}
		
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
