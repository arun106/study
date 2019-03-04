package com.udemy.sorting;

public class Mergesort {

	public static void main(String[] args) {
		int arr[] = {5, 10, -15, 25, 1, -25, 30, 2};
		
		mergesort(arr, 0, arr.length);
		
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

	}
	
	//{5, 10, -15, 25, 1, -25, 30, 2}
	public static void mergesort(int[] arr, int start, int end)
	{
		if(end - start < 2){
			return;
		}
		int mid = (start + end)/2;
		mergesort(arr, start, mid);
		mergesort(arr, mid, end);
		merge(arr,start,mid,end);
	}
	
	//{5, 10, -15, 25, 1, -25, 30, 2}
	public static void merge(int[] arr, int start, int mid, int end) {
		if(arr[mid-1] <= arr[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, arr, start, tempIndex);
	}

}
