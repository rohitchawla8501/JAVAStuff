<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
String user=request.getParameter("user");
//out.print(user);
/* if(user.equals(null))
	throw new NullPointerException(); */
if(user.equals("rohit"))
{
%>
HI <% out.println(user);
} %> --%>
	
	
	<jsp:useBean id="empobj" class="com.seed.actiondemo.Employee"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="empName" name="empobj" value="${param.user }" />
	<a href="getprop.jsp"><br>Click here to get</a>
	 <jsp:forward page="getprop.jsp"><jsp:param value="Rohit" name="user"/></jsp:forward>
</body>
</html>