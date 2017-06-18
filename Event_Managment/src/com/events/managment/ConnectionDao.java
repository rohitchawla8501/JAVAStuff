package com.events.managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {

	
	
	public static Connection connect() throws SQLException, ClassNotFoundException {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		System.out.println("Connected");
		return conn;
	}
	
	public static void main(String[] args) {
		

	}

}
