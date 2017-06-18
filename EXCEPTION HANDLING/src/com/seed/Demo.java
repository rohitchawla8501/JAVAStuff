package com.seed;
public class Demo{

	
	public void divide(int a,int b)
	{
		System.out.println("Division is "+(a/b));
	}

   public static void main(String[] args) {
	Demo d=new Demo();
	try
	{
		d.divide(10, 2);
	    String s=null;
	    System.out.println(s.equals("Rohit"));
	}
	catch (ArithmeticException|NullPointerException e)
	{
		System.out.println("Problem");
	}
   /* catch(NullPointerException e)
    {
    	System.out.println("Null pointer");
    }*/
   try
   {
	int a[]={1,2,3,4,5};
	System.out.println("array th element"+a[5]);
   }
   catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("Array out of bounds");
   }
   
   }

}
