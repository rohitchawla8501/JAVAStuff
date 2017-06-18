package com.seed;

import java.util.*;

public class CreateSet {

	
	public static Set create()
	{
	
		HashSet s= new HashSet();
		/*s.add("JAVA");

		HashSet s1= new HashSet();
		s1.add("JAVA");
		HashSet s2= new HashSet();
		s2.add("JAVA");
		s2.add("c#");*/
	System.out.println("Enter no of skillsets");
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	for (int i = 0; i < l; i++) {
	
		s.add(sc.next());
	}
		return s;
	}
}
