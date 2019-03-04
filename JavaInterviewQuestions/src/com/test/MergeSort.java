/**
 * 
 */
package com.test;

/**
 * @author Arun Mohan
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {5,4,3,1,2};
		mergesort(A);
	}
	
	public static void mergesort(int[] A)
	{
		for(int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println();
		mergesort(A,0,A.length-1);
		for(int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
	}
	
	public static void mergesort(int[] A,int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergesort(A,l,mid);
			mergesort(A,mid+1,r);
			merge(A,l,mid,r);
		}	
	}
	
	public static void merge(int[] A, int l, int m, int r)
	{
		int n1 = m-l+1, n2=r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for (int i=0; i<n1; i++)
			L[i]=A[l+i];
		for (int i=0; i<n2; i++)
			R[i]=A[m+i+1];
		
		int i=0, j=0, k=l;
		while (i<n1 && j<n2)
		{
			if(L[i] <= R[j])
				A[k++]=L[i++];
			else
				A[k++]=R[j++];
		}
		while (i<n1)
			A[k++]=L[i++];
		while (j<n2)
			A[k++]=R[j++];
		
	}
}
