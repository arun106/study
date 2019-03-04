package com.udemy.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20, 35, -15, 7, 55, 1, -22};
		quickSort(arr, 0, arr.length);
		for (int i:arr)
			System.out.print(i + " ");
	}
	
	public static void quickSort (int[] num, int start, int end) {
		if (end - start < 2)
			return;
		int pivotIndex = partition (num, start, end);
		quickSort(num, start, pivotIndex);
		quickSort(num, pivotIndex+1, end);
		
	}
	
	public static int partition (int[] num, int start, int end) {
		int pivot = num[start];
		int i = start, j = end;
		while(i < j) {
			while (i<j && num[--j] >= pivot); 
			if (i<j) {
				num[i] = num[j];
			}
			while (i<j && num[++i] <= pivot); 
			if (i<j) {
				num[j] = num[i];
			}
		}
		num[j] = pivot;
		return  j;
	}
	
}
