package com.tns.abstraction_1;

public class Demo_abs {
	
	public static void main(String args[])
	{
		square sq=new square(8);
		sq.calArea();
		sq.calPerimeter();
		System.out.println("The area of square is : " + sq.showArea());
		System.out.println("The perimeter of square is :" +sq.showPerimeter());
		
		rect r=new rect(3,4);
		r.calArea();
		r.calPerimeter();
		System.out.println("The area of rectangle is : " +r.showArea());
		System.out.println("The perimeter of rectangle is :" +r.showPerimeter());
		
		
	}

}
