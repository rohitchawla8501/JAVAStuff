package com.seed.hello;

public class HelloWorldAction {
String username,password,errMsg;
	public String execute()
{
	if(username.equals("rohit")&& password.equals("rohit"))
	{
		errMsg="";
		return "success";
	
	}
	else
	{
		errMsg="Unauthorized user";
		return "failure";
	}
}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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
}
