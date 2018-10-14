package com.Infy;

import java.util.Arrays;

public class ChocolateBagWizard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,10,22,15,32};
		int time = 4, length = arr.length, choccount=0;
		
		for (int i=0; i<time; i++)
		{
			Arrays.sort(arr);
			choccount += arr[length-1]; //Kid ate all the chocolates from the bag with maximum chocolates
			arr[length-1] = arr[length-1]/2;
		}
		System.out.println(choccount);
	}

}
