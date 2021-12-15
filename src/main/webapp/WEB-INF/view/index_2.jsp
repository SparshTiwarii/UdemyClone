<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
		<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	<h1>
		<%
		/* String name = (String) request.getAttribute("name"); */ /* Business logic */
		%>
	</h1>
	<h1>Name is ${name }</h1>
	<!-- Printable statements -->
</body>
</html>