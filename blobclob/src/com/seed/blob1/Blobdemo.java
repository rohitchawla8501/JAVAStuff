package com.seed.blob1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Blobdemo {

	public static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		System.out.println("Connected");
		return conn;
	}

	
	
	public static void main(String[] args) throws SQLException,
			IOException {
		Connection conn = connect();
		String sql = "update  emp set photo=? where empno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql,
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		InputStream is = new FileInputStream(
				"C://Users//Public//Pictures//Sample Pictures//Jellyfish.jpg");

		pstmt.setBlob(1, is);
		pstmt.setInt(2, 1901);
		int i = pstmt.executeUpdate();
       if (i >0)
    	   System.out.println("Updated");
	
       String sql1="select photo from emp13 where empno=102 ";
       PreparedStatement stmt2 = conn.prepareStatement(sql1);
       ResultSet result = stmt2.executeQuery();
       if (result.next()) {
           
    	   Blob blob = result.getBlob("photo");
           InputStream inputStream = blob.getBinaryStream();
           OutputStream outputStream = new FileOutputStream("D://sir.jpg");

           int bytesRead = -1;
          byte[] buffer = new byte[5];
           while ((bytesRead = inputStream.read()) != -1) {
               outputStream.write(bytesRead);
           }

       }
       
	}
}

	
	
       	
	
	
