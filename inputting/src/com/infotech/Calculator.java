package com.infotech;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	int a,b ;
	String choice;
	String ans;
	Scanner sc=new Scanner(System.in);
	do
	{
	System.out.println("Enter value for a");
	a=sc.nextInt();
	System.out.println("Enter value for b");
	b=sc.nextInt();
	System.out.println("Enter your choice  1.ADD 2.SUB 3.MUL");
     choice=sc.next();	
     choice=choice.toUpperCase();
     switch(choice)
     {
     case "ADD":
    	 System.out.println("Addition is "+(a+b));
         break;
     
     case "SUB":
    	 System.out.println("Subtraction is "+(a-b));
         break;
     case "MUL":
    	 System.out.println("Multiplication is "+(a*b));
         break;
     case "DIV":
    	 System.out.println("Division is "+(a/b));
         break;
     
     
     
     }
System.out.println("Do you want to continue");
	
	ans=sc.next();
	
	}while(ans.equalsIgnoreCase("yes"));
	}


}
