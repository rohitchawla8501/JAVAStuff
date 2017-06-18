+
65package com.events.managment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	String username, password, custad;

	public String getCustad() {
		return custad;
	}

	public void setCustad(String custad) {
		this.custad = custad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute()
{
	try {
		Connection conn;
		
			conn = ConnectionDao.connect();
		
	    Statement st=conn.createStatement();
	    if(custad.equals("Admin"))
	    {
	    ResultSet rs=st.executeQuery("select *from login1");
	    while(rs.next())
	    {
	    	if(username.equals(rs.getString(1))&& password.equals(rs.getString(2)))
	    	{
	    		return "admin";
	    	}
	    	
	    		
	    	
	    }
	} 
	    
	    else{ResultSet rs=st.executeQuery("select *from customerlogin");
	    while(rs.next())
	    {
	    	if(username.equals(rs.getString(1))&& password.equals(rs.getString(2)))
	    	{
	    		return "success";
	    	}
	    	
	    }
	    	
	    }
	
	}
	    catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
catch(ClassNotFoundException e)
{
	System.out.println("class not found");
}

	

	
	
	return "error";
}

	public void validate() {

	}

}
