package com.Infy;

public class FindOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		/*int x = 25, y = 0;
	    int z = x / y;
	    System.out.println("Hello World!"+z);
	    */
	    
		//2
		/*boolean val;
	    if (val)
	        System.out.println("TRUE");
	    else
	        System.out.println("FALSE");*/
	    
	    //3
		/*int arr[]=new int[5];
		for (int i=0; i<=5; i++)
			 System.out.println(arr[i]);
	    */
		int i = 8;
		int p = i++*i++; //p=72, i=10
		int q = i++; //q=10, i=11
		int r = ++i; //r=12, i=12
		i=8;
		System.out.println(i); //8
		
		int s = ++i*++i; //s=90, i=10
		
		System.out.println("i"+i+" p"+p+" q"+q+" r"+r+" s"+s);
		
		
	}

}
