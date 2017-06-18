package com.seed.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	public String user,pswd;
	
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
	
	public String execute(){
		
		if(user.equals("admin") && pswd.equals("admin123"))
			return "success";
		else
			return "error";
	}
}
