package com.seed;

public class Test {

	
	public static void main(String[] args) {
		Printable p=new Rectangle(10,12);
		p.show();
        p.details();
		Printable p1=new Mydate(10,12,2016);	
	     p1.show();
	     p1.details();
	}

}
