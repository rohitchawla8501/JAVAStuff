package com.seed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demofile {
public static void main(String[] args) throws IOException {
	File f= new File("test.txt");
	String s="Hello there";
	if(!f.exists()){
		f.createNewFile();
		System.out.println("File created");
		
	}
	else{
		/*FileOutputStream fos= new FileOutputStream(f);
		byte a[]=s.getBytes();
		fos.write(a);*/
       FileInputStream fis=new FileInputStream(f);
       int i;
       while((i=fis.read())!=-1)
       {
       System.out.print((char)i);
       }
	}

}
}
