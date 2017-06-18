package com.seed.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	String user, pswd,username,password;

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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String execute() {
	
	
			return "success";
	
	
	}

public void validate()
{
	if(username==null||username.equals(""))
	{
		this.addFieldError("username", "Enter name");

	}
 if(password.length()>8)	
{
	addFieldError("password", "asdas");
}
}

}
