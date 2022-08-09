<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo!!!!! form JSP</title>
</head>
<body>
<!--  this is the java scriptlet not recomanded to use the any web
application and so on 	<%//System.out.println(request.getParameter("name"));
	request.getParameter("name");Date date = new Date();%> -->
	
<!--	<div>Current date is
		<%=date%></div>
	My First JSP ${name} and Password is ${password }-->
	
	
	
	
	<form action="/login.do" method="post">
	<p><font color="red">${errorMessage}</font></p>
	Enter your name <input type="text" name="name"/> Password: <input type="password" name="password"/> <input type="submit" value="Login"/>
	</form>
	
</body>
</html>