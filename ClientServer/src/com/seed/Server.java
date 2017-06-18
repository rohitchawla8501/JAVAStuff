package com.seed;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
ServerSocket ss;
Socket s;
String str1,str2;
DataInputStream dis,dis1;
DataOutputStream dos;
Server() throws IOException
{
	ss= new ServerSocket(3000, 1, InetAddress.getLocalHost());
    System.out.println("waiting to connect");
    s=ss.accept();
    System.out.println("connected");
    dis=new DataInputStream(System.in);
    dos= new DataOutputStream(s.getOutputStream());
    dis1=new DataInputStream(s.getInputStream());
	
while(true){
	str1=dis.readLine();	
	dos.writeUTF(str1);
	str2=dis1.readUTF();
System.out.println(str2);
}

}
public static void main(String[] args) {
	try {
		new Server();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}

