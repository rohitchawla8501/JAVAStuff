package com.seed;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
String str1,str2;
	Socket s;
	DataInputStream dis,dis1;
	DataOutputStream dos;
	Client() throws UnknownHostException, IOException{
		s= new Socket("192.168.1.6", 3000);
	  
	    dis1=new DataInputStream(s.getInputStream());
	    dis=new DataInputStream(System.in);
	    dos= new DataOutputStream(s.getOutputStream());
	    while(true){
	    	
	    	str2=dis1.readUTF();
	    System.out.println(str2);
	    str1=dis.readLine();	
    	dos.writeUTF(str1);
	       
	    }
	
	
	}
	
public static void main(String[] args) {
	try {
		new Client();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
