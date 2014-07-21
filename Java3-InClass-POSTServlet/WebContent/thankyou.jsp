<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thank you for signing up for the monthly coupons!</h1>
	
	<p>The data you entered is:</p>
	
	<label>First Name:</label>
	<span>${person.firstName}</span><br>
	
	<label>Last Name:</label>
	<span>${person.lastName}</span><br>
	
	<label>Email:</label>
	<span>${person.email}</span><br>

	<p>Enter another email address by clicking the Back button on 
	your browser or "Return" button below</p>
	
	<form action="" method="get">
		<input type="hidden" name="action" value="showMain">
		<input type="submit" value="Return">
	</form>
</body>
</html>