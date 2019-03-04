package com.geeks;

public class KLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6, 11, 20, 35, 45, 1, 23};
		
		findklargest(arr,3);
	}
	
	public static void findklargest(int[] arr, int k)
	{
		for (int unsorted=arr.length-1; unsorted > (arr.length-k); unsorted--)
		{
			for (int i=0; i<unsorted; i++)
			{
				if(arr[i] > arr[i+1])
				{
					swap(arr, i, i+1);
				}
			}
		}
		for (int i=0; i<k; i++)
			System.out.print(arr[arr.length - i - 1]+" ");
	}
	public static void swap (int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
