package com.interviews.am;

class Point{
	int x,y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

public class PassbyValueRefTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassbyValueRefTest test = new PassbyValueRefTest();
		int x=0, y=0;
		System.out.println(x+" "+y);
		test.tricky(x, y);
		System.out.println(x+" "+y);
		
		Integer x1=new Integer(10);
		Integer y1=new Integer(10);
		trickyObject(x1, y1);
		System.out.println(x1+" "+y1);
		
		
		Point arg1 = new Point(0,0);
		Point arg2 = new Point(0,0);
	
		System.out.println(arg1.x+" "+arg1.y);
		System.out.println(arg2.x+" "+arg2.y);
		
		test.trickyObj(arg1,arg2);
		
		System.out.println(arg1.x+" "+arg1.y);
		System.out.println(arg2.x+" "+arg2.y);
		
		System.out.println("hashcode:" + arg1.hashCode());
		System.out.println("hashcode:" + arg2.hashCode());

		arg2 = arg1;
		
		System.out.println("hashcode:" + arg1.hashCode());
		System.out.println("hashcode:" + arg2.hashCode());

	}
	
	public void trickyObj(Point arg1,Point arg2)
	{
		arg1.x=2;
		arg1.y=2;
		
	}
	
	public void tricky(int x,int y)
	{
		x=20;
		y=20;
	}

	public static void trickyObject(Integer x,Integer y)
	{
		x=30;
		y=30;
	}
}
