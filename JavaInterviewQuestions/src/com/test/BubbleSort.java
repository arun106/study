package com.test;

public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {5,4,3,1,2};
		bubblesort(A);
	}
	
	public static void bubblesort(int A[])
	{
		int n = A.length, temp=0;
		for (int i=0; i<n; i++)
		{
			for( int j=0; j<n-i-1; j++)
			{
				if(A[j] > A[j+1])
				{
					temp = A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(A[i]+" ");
		
	}

}
