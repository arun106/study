package com.Infy;

public class PrintUncommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={10,20,25,35,40,50,60,70},
				arr2[]={10,15,20,30,45,80};
		int i=0, j=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.println(arr1[i]);
				i++; 
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.println(arr2[j]);
				j++;
			}
			else
			{
				i++; j++;
			}
		}
		while(i<arr1.length)
		{
			System.out.println("Remaining first"+arr1[i]);
			i++;
		}
		while(j<arr2.length)
		{
			System.out.println("Remaining second"+arr2[j]);
			j++;
		}
		
	}

}
