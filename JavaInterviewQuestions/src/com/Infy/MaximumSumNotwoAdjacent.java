package com.Infy;

public class MaximumSumNotwoAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,10,100,10,5};
		System.out.println(printmaxSum(arr,arr.length));
		
		
	}
	
	static int printmaxSum(int[] arr, int length)
	{
		int incsum=arr[0];
		int excsum=0,excsum_new=0;
		
		for (int i=1; i<length; i++)
		{
			excsum_new= (incsum > excsum) ? incsum:excsum;
			incsum = excsum + arr[i];
			excsum = excsum_new;
		}
		
		
		return 1;
	}

}
