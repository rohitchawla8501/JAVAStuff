package com.seed1;

public class Test {
	
	public static void main(String args[])
	{
		Outer o =new Outer();
		o.display();
		Outer.Inner i=o.new Inner();
		i.show();
	}
}
