package com.seed.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
	
	public String fname,lname,emailid,age;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	/*@Override
	public void validate() {
		// TODO Auto-generated method stub
		//Required Validation
		
		if(fname == "" || fname == null){
			addFieldError("fname", "*Field is mandatory");
		}
		if(lname == "" || lname == null){
			addFieldError("lname", "*Field is mandatory");
		}
		if(emailid == "" || emailid == null){
			addFieldError("emailid", "*Field is mandatory");
			addActionError("Fields are mandatory");
				
		}
		//Min Max
		
		if(age!=null )
		{	
			int ageInt =Integer.parseInt(age);
			if ( ageInt <0 || ageInt >100  ){
			addFieldError("age", "*Age value is invalid");
			}
		}
		
		
		
	}*/

	public String execute(){
		
		//Class.forName(oracle.jdbc.dr)
		
		return "success";
	}
}
