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

<%--
	We moved these <script> tags down to the bottom at the body tag
	so that content is loaded before interactivity.

<!-- JQuery -->
<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

 --%>

<title>Login</title>
</head>
<body>
	<h2>Login</h2>

	<c:if test="${ not empty error }">
		<h3 style="color:red;">Error:  ${error }</h3>
	</c:if>

	<form  role="form" action="/loginServlet" method="post" >
		<input type="hidden" name="action" value="login">
		<div class="form-group">
			<label for="username">Username</label>
			<input id="username" type="text" name="username" placeholder="Username" > <br>
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input id="password" type="text" name="password" placeholder="Password" > <br>
		</div>
		<button type="submit" class="btn btn-default">Login</button>
	</form>


	<!-- JQuery -->
	<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

</body>
</html>