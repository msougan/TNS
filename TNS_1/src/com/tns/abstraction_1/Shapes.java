package com.tns.abstraction_1;

public abstract class Shapes {
	
	int area;
	int perimeter;
	
	abstract int calArea();
	
	abstract int calPerimeter();
	
	public int showArea()
	{
		return area;
		
	}
	
	public int showPerimeter()
	{
		return perimeter;
		
	}

}
