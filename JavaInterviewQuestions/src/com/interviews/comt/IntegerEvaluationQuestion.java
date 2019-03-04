package com.interviews.comt;


public class IntegerEvaluationQuestion {

	static class A
	{
		static int i = 1111;
		static
		{
			i = i-- - --i;
			System.out.println("A1:"+i); //2
		}
		{
			i = i-- - --i;
			System.out.println("A2:"+i); //2
		}
		
	}
	
	static class B extends A
	{
		static
		{
			i = i-- - --i;
			System.out.println("B1:"+i); //2
		}
		{
			i = i-- - --i;
			System.out.println("B2:"+i); //2
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int j = 5;
		j = ++j - ++j;
		System.out.println("j:" + j); //-1
		
		
		B b = new B();
		System.out.println(b.i); //7
		
		/*for (int i=0; i<10; i++) //++i - No difference
			System.out.println("i check:"+i);*/ 
		j=5;
		int k = j++ - --j + j++; //5 - 5 + 5
		System.out.println(j+" "+k); //6 5
		
	}

}
