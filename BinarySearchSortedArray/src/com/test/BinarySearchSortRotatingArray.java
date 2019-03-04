package com.test;

public class BinarySearchSortRotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={3,4,5,6,7,1,2}, n=7;
		
		int key=8;
		
		int search=findElement(arr,0,n-1,key);
		
		System.out.println("Element found at "+search);
		
	}
	
	public static int findElement(int a[], int low, int high, int key)
	{
		System.out.println("Iteration low "+low+" high "+high+" key "+key);
		
		int pivot= (low+high)/2;
		
		if(a[pivot] == key)
			return pivot;
		
		if(low > high)	
			return -1; //Not found
		
		if(a[low] <= a[pivot]){
			if(key >= a[low] && key <= a[pivot])
				return findElement(a,low,pivot-1,key);
			return findElement(a,pivot+1,high,key);
		}
		if(a[pivot] <= a[high])
		{
			if (key >= a[pivot] && key <= a[high])
				return findElement(a,pivot+1,high,key);
			return findElement(a,low,pivot-1,key);
		}
		return -1; //Not found
	}
	
}
