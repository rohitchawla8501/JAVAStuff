package com.seed1;

public class Outer {
 private int z=100;
  
 public class Inner
 {
	 private int x=50;
	 
	 
	 public void show()
	 {
		 System.out.println("VAlues of x "+x);
		 System.out.println("value of z "+z);
	 }
	 
 }

public void display()
{
	Inner i1=new Inner();
	System.out.println("Outer accessing inner element"+i1.x);
}

}
