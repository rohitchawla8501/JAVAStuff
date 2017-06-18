package com.seed;
import java.io.File;
import java.io.IOException;
public class Demo1 {
	public void create()
	{
		File i=new File("z:/Rohit/rohit.txt");
		if(!i.exists())
		{
	   try{
		i.createNewFile();
	   System.out.println("File Created");
	   }
		catch (IOException e)
		{
			System.out.println("cannot create file");
		}
		}
		else{
			System.out.println("File already exists");
		}
	}

public static void main(String[] args) {
	Demo1 d= new Demo1();
		d.create();
			
}
}
