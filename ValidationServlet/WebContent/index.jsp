<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coupon Registration Page</title>
</head>
<body>
<h1>Register For Discount Coupons!</h1>
	<p>To get emails once a month with coupons, 
	enter you name and email below</p>
	
	<p style="color:red">${message}</p>
	 
	<form action="ValidateCouponSignupServlet" method="post">
		<input type="hidden" name="action" value="addCouponSubscriber">
		
		<label>First Name:</label>
		<input type="text" name="firstName" value="${firstName}"><br>
		
		<label>Last Name:</label>
		<input type="text" name="lastName" value="${lastName}"><br>
		
		<label>Email:</label>
		<input type="text" name="email" value="${email}"><br>
		
		<label>&nbsp;</label>
		<input type="submit" value="Sign up" id="submit">
	
	</form>
</body>
</html>