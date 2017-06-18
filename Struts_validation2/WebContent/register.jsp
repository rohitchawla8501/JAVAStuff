<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h1>Welcome to my Page</h1>
	
	<s:actionerror/>
	
	<s:form action="register.action" method="post" >
	<s:textfield name="fname" label="First name:" />
	<s:textfield name="lname" label="Last name :" />
	<s:textfield name="emailid" label="Email :" />
	<s:textfield name="age" label="Age :" />
		<s:submit value="Add Customer"  />
	</s:form>
</body>
</html>