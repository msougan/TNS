package com.tns.abstraction_1;

public class square extends Shapes{
	
	int s;
	
	public square(int s)
	{
		super();
		this.s=s;
		
	}
	
	
	int calArea()
	{
		return area=s*s;
		
	}
	int calPerimeter()
	{
		return perimeter=4*s;
	}
		

}
