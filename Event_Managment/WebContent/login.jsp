<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:form action="login.action">
<h1 align="center">LOGIN PAGE</center></h1>
<hr>
<s:radio list="{'Customer','Admin'}" name="custad"></s:radio>
<s:textfield name ="username" label="Username"   />

<s:password name ="password" label="Password"   />

<s:submit value="login" />
<a href=register.jsp>Register</a> 
</s:form>
</body>
</html>