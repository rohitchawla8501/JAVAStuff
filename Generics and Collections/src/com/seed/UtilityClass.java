package com.seed;

import java.util.*;

public class UtilityClass {

	
	public static void printList(List li)
	{
		Iterator i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	}
}
}