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

<title>New Quote</title>
</head>
<body>

<%@ include file="navbar.jsp" %>

	<h2>Add a New Quote</h2>

	<form  role="form" action="newQuoteServlet" method="post" >
		<input type="hidden" name="action" value="addNewQuote">
		<div class="form-group">
			<label for="quote">Quote</label>
			<input id="quote" type="text" name="quote" placeholder="Quote" > <br>
		</div>
		<div class="form-group">
			<label for="author">Author</label>
			<input id="author" type="text" name="author" placeholder="Author" > <br>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

<%@ include file="footer.jsp" %>
</body>
</html>