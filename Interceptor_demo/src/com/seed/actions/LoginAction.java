package com.seed.actions;



public class LoginAction {
	
	public String username,password;
	

	
	
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




	public String execute(){
		
		if(username.equals("admin") && password.equals("admin123"))
			return "success";
		else
			return "error";
	}
}
