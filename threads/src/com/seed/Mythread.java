package com.seed;

public class Mythread extends Thread {

	Mythread(String name)
	{
		super(name);
	}
	
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		Mythread t1 =new Mythread("rohit");
		
		Mythread t2 =new Mythread("rohit1");
		
		t1.start();
		t2.start();
	System.out.println("in main");
	}

}
