package com.infotech;

public class Box {
	public static void main(String[] args) {
		int i=10;
		Integer j =new Integer(i);//boxing
		System.out.println(j);
		StringBuffer sb=new StringBuffer("SEEEEED");
		sb=sb.reverse();
	System.out.println(sb);
	int k=j.intValue();//unboxing
	System.out.println(k);
	
	}
    
}
