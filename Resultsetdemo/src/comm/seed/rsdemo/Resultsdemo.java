package comm.seed.rsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultsdemo {

	public static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@192.168.1.101:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		System.out.println("Connected");
		return conn;
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = connect();

		Statement stmt = null;

		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select EMPNO,ENAME from EMP");

		rs.first();
		System.out.println("First " + rs.getInt(1) + " " + rs.getString(2));
        
		rs.last();
		System.out.println("Last  " + rs.getInt(1) + " " + rs.getString(2));
		
        rs.previous();
        System.out.println("Previous " + rs.getInt(1) + " " + rs.getString(2));
        
        rs.absolute(3);
        System.out.println("Absolute " + rs.getInt(1) + " " + rs.getString(2));
        
        
        rs.relative(-1);
        System.out.println("Relative " + rs.getInt(1) + " " + rs.getString(2));
	
	   //Update
        
        rs.beforeFirst();
        
       while(rs.next())
       {
    	   rs.deleteRow();
       }
        
        /*  while(rs.next())
        {
        int newid = rs.getInt(1) - 2000;
        rs.updateInt(1,newid);
        rs.updateRow();
        System.out.println( rs.getInt(1) + " " + rs.getString(2));
        }*/
	   
	
	
	}

}
