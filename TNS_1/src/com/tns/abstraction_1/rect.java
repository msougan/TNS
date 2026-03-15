package com.tns.abstraction_1;

public class rect extends Shapes{
	
	int height;
	int width;
	
	public rect(int height,int width)
	{
		 super();
		 this.height=height;
		 this.width=width;
		 
	}
	
	@Override
	int calArea()
	{
		return area=height*width;

	}
	
	@Override
	int calPerimeter()
	{
		return perimeter=2*(height+width);
	}
}
