package com.Infy;

public class StringStartEndOtherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "geeksforgeeks";
		 String corner = "geeks";
		 if (isCornerPresent(str, corner))
			 System.out.println("Yes");
		 else
		 	System.out.println("No");
	}
	static boolean isCornerPresent(String str,String corner)
	{
		int strlen=str.length(), cornerlen=corner.length();
		
		if(strlen<cornerlen)
			return false;
		
		System.out.println("Start:"+str.substring(0, cornerlen));
		System.out.println("End:"+str.substring(strlen-cornerlen,strlen));
		
		/*String strCheck = "string1";
		strCheck = strCheck.concat("234");
		System.out.println(strCheck);*/
		
		return str.substring(0, cornerlen).equalsIgnoreCase(corner) && str.substring(strlen-cornerlen,strlen).equalsIgnoreCase(corner);
		
	}

}
