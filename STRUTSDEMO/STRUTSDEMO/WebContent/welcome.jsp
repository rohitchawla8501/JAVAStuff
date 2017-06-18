<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Personal Information</title>
</head>
<body>
<s:property value="user"/>
<s:form name="personalform" cssStyle="color:#7a3d3d" action="hello.action">
<%--  <s:action name="hello.action"></s:action>  --%>
<s:textfield name="username" label="UserName" size="15"/>
<s:password name="password" label="Password" size="15"/>
<s:textfield name="fullname" label="Name" size="25"/>
<s:datetimepicker name="dob" label="Date of Birth" adjustWeeks="true" displayFormat="dd MM, yyyy" toggleType="wipe"/>
<s:textarea name="address" label="Address" rows="4" cols="20"/>
<s:doubleselect name="country" label="Select Country and City" list="{'Australia','India'}" doubleName="city" doubleList="top == 'Austrlia'? {'Sydney','Melbourne','Brisbane','Perth'} : {'Delhi','Mumbai','Chennai','Kolkata'}"/>
<s:select name="language" label="Preferred Language(s)" list="{'English','Hindi','French','German'}"/>
<s:radio name="mstatus" label="Martial Status" list="{'Single','Married','Divorcee'}" value="Single" />
<s:checkboxlist name="skill" label="Your Interest" list="{'Programming','Testing','Research','Web Designing'}"/>
<s:submit value="Submit" align="center"/>
</s:form>
</body>
</html>