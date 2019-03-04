package com.test;

public class IndexofFirstOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,0,0,0,0,1};
		System.out.println(indexofFirstOne(arr));
	}
	
	static int indexofFirstOne(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
				return i;
		}
		return -1;
	}

}
