package com.interviews.sale;

public class StringRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr = "abaaaaaaaacdefg", subStr = "cd";
		
		char[] inCh = inputStr.toCharArray();
		char[] subCh = subStr.toCharArray();
		int j = 0;
		
		for (int i=0; i<inputStr.length();i++)
		{
			//System.out.println(i+" "+j);
			if(j == subCh.length)
			{
				char[] chOut = inputStr.substring(i, inputStr.length()).toCharArray();
				System.out.println(chOut);
				break;
			}
			else if (inCh[i] == subCh[j])
			{
				j++;
			}
			else
			{
				j=0;
			}
		}
		
	}

}
