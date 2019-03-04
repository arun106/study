package com.hackerrank.biggergreater;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(biggerIsGreater("wcqpxg")); //dkhc -> hcdk
	}
	
	public static String biggerIsGreater(String w) {
		char[] c = w.toCharArray();
		char x;
		boolean found = false;
		int i = w.length()-1, j = 0;
		while (i > 0) {
			j = i-1;
			x=c[j];
			while (j>=0) {
				if(c[j] < c[i]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					found = true;
					break;
				}
				j--;
			}
			if (found) {
				break;
			}
			i--;
		}
		if(found) {
			mergesort(c, j, w.length()-1);
			return String.valueOf(c);
		}
		else {
			return "no answer";
		}
    }
	public static void mergesort(char[] A,int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergesort(A,l,mid);
			mergesort(A,mid+1,r);
			merge(A,l,mid,r);
		}	
	}
	
	public static void merge(char[] A, int l, int m, int r)
	{
		int n1 = m-l+1, n2=r-m;
		char L[] = new char[n1];
		char R[] = new char[n2];
		
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
