package com.seed;
import java.io.*;
import java.util.*;
public class Sortutil {

	public  static void sort(List li)
	{
		Collections.sort(li);
		UtilityClass.printList(li);
	}
	
	public static void sortBySalary(List li)
	{
		Collections.sort(li,new Comparebysalary());
		UtilityClass.printList(li);
	}
	
}
