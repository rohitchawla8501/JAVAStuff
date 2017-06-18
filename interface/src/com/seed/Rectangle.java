package com.seed;

public class Rectangle extends Shape implements Printable {
	int length,breadth;

	
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}



	public void area()
	{
		System.out.println("Area of Rectangle is"+(length*breadth));
		
	}
public void show()
{
	System.out.println("length "+length+" Breadth "+breadth);
}

public void details()
{
	System.out.println("Extended interface function 1");
}
}
