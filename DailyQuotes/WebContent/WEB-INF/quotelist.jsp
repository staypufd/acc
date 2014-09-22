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

<title>Daily Quotes</title>
</head>
<body>
<%@ include file="navbar.jsp" %>

	<div class="container">
		<h1>Today's Quotes</h1>

		<c:if test="${sessionScope.isLoggedIn == true}">
			<form action="/newQuoteServlet" method="get" name="newQuote">
				<input class="btn btn-primary" type="submit" title="newQuote" value="New Quote">
			</form>
			<br/>
		</c:if>



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
						<c:if test="${sessionScope.isLoggedIn == true}">
<%-- 							<form action="/EditQuoteServlet" method="GET" name="editQuote">
								<input type="hidden" name="quoteNumberToEdit" value="${ aQuote.id }">
								<button type="submit" class="btn btn-primary btn-xs">Edit</button>
							</form> --%>

							<a href="/EditQuoteServlet?id=${ aQuote.id }"  class="btn btn-primary btn-xs">Edit</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<!-- JQuery -->
	<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>


	<%@ include file="footer.jsp" %>
</body>
</html>






















