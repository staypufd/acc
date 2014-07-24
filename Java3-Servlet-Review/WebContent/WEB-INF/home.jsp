<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	Howdy This is the Home Page
	
	<p>${name} is ${age} years old.</p>
	
    <p>Go to our context root page again but with different request parmaters</p>
	<a href="?name=Bob%20Smith&age=77">Go to Page for Bob Smith</a>
	
	
	<p>Go to an external site -> <a href="http://www.cnn.com">This is CNN</a></p>
	
	<a href="?action=gotogoodbye">Go to Goodbye</a>

</body>
</html>