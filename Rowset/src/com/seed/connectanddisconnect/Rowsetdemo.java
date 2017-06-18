package com.seed.connectanddisconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

import com.sun.rowset.JdbcRowSetImpl;

public class Rowsetdemo {

	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
 System.out.println("Connected"); 
	
	JdbcRowSet jrs = new JdbcRowSetImpl(conn);
	jrs.setType(ResultSet.TYPE_SCROLL_SENSITIVE);
	jrs.setCommand("select empno,empname from emp13");
	jrs.execute();
	
	while(jrs.next())
	{
		System.out.println(jrs.getInt(1)+"   "+jrs.getString(2));
				
	}
	
	jrs.last();
	jrs.moveToInsertRow();
	jrs.updateInt(1, 107);
	jrs.updateString(2, "zzz");
	jrs.insertRow();
	System.out.println("  ");
	System.out.println("Updated");
	jrs.beforeFirst();
	while(jrs.next())
	{
		System.out.println(jrs.getInt(1)+"   "+jrs.getString(2));
				
	}
	
	
	}	
	
}
