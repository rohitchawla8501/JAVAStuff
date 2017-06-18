<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	
	<%
		String user=request.getParameter("user");
	String pswd=request.getParameter("pswd");
	if(user.equals("rohit"))
	{%>	<tr><td>LOGIN SUCCESSFUL</td></tr><%}%>

</table>
</body>
</html>