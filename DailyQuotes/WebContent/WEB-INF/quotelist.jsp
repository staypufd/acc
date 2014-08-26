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

<title>Daily Quotes</title>
</head>
<body>
	<h1>Today's Quotes</h1>
	<div class="container">
		<table class="table table-striped">
			<c:forEach items="${theQuotes }" var="aQuote">
				<tr>
					<td>
						<blockquote class="blockquote">
							<p>${aQuote.quote }</p>
							<footer>
								<c:out value="${aQuote.author }"/>
							</footer>
						</blockquote>
					</td>
				</tr>
			</c:forEach> 
		</table>
	</div>
</body>
</html>








