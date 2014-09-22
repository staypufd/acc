<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="<c:url value="/bootstrap-3.2-3.0-dist/css/bootstrap.min.css"/>">

<!-- Optional theme -->
<link rel="stylesheet" href="<c:url value="/bootstrap-3.2-3.0-dist/css/bootstrap-theme.min.css"/>">

<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

<title>Add New User</title>
</head>
<body>

<%@ include file="navbar.jsp" %>

	<div class="container">
		<h2>Add a New User</h2>

		<p class="bg-danger">${errorMessage}</p>

		<form  role="form" action="newUserServlet" method="post" >
			<input type="hidden" name="action" value="addNewUser">
			<div class="form-group">
				<label for="username">User</label>
				<input id="username" type="text" name="username" placeholder="Username" > <br>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input id="password" type="text" name="password" placeholder="Password" > <br>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>


	<%@ include file="footer.jsp" %>
</body>
</html>