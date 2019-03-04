package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DMatrixbycolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int matrix[][] = { { 39, 27, 11, 42 },
                 { 10, 93, 91, 90 },
                 { 54, 78, 56, 89 },
                 { 24, 64, 20, 65 } };
		// Sort this matrix by 3rd Column
		int col = 3;
		//sortbyColumn(matrix, col - 1);
		
		System.out.println(matrix);
	}
	/*public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
           
          @Override             
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
 
            // To sort in descending order revert 
            // the '>' Operator
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }*/

}
