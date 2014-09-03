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
	<form action="newQuoteServlet" method="get" name="newQuote">
		<input class="btn btn-primary" type="submit" title="newQuote" value="New Quote">
	</form>
	<br/>
	<div class="container">
		<table class="table table-striped">
			<c:forEach items="${theQuotes }" var="aQuote">
				<tr>
					<td>
						<blockquote class="blockquote">
							<c:out value="${ aQuote.id }"/>
							&mdash;
							<c:out value="${aQuote.quote }"/>
							<footer>
								<c:out value="${ aQuote.author }"/>
							</footer>
						</blockquote>
					</td>
				</tr>
			</c:forEach> 
		</table>



<%-- This is a JSP comment 

	<sql:query var="results" 		
				sql="select id, quotation, author from quote;"
				dataSource="jdbc/quoteDB">
	</sql:query>

	<table class="table table-striped">		
	<c:forEach items="${results.rows }" var="row">
				<tr>
					<td>
						<blockquote class="blockquote">
							<p>${row.id} - ${row.quotation }</p>
							<footer>
								<c:out value="${row.author  }"/> 
							</footer>
						</blockquote>
					</td>
				</tr>
			</c:forEach> 
		</table>
--%>
	</div>
</body>
</html>






















