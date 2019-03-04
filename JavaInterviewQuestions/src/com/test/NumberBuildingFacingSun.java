package com.test;

public class NumberBuildingFacingSun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] floor={7, 4, 8, 2, 9, 2, 9, 2, 7, 10};
		int high=0,count=0;
		for(int i=0; i<floor.length; i++)
		{
			if(floor[i]>high)
			{
				high=floor[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
