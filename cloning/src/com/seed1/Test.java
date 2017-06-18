package com.seed1;

public class Test {
public static void main(String[] args) {
	Employee e=new Employee(100,"rohit",300000,new Mydate(2,12,2029));
	try
	{
		Employee e1=(Employee) e.clone();
	System.out.println(e);
	System.out.println(e1);
	e1.getDoj().setDay(20);
	System.out.println(e);
	System.out.println(e1);
	}
   catch(CloneNotSupportedException s)
   {
	   System.out.println("cannot clone");
   }

}
}
