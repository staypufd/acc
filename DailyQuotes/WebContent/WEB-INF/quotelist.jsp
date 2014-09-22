<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<link rel="stylesheet" href="<c:url value="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"/>">



<my:layout>
<jsp:attribute name="body">
	<div class="container">
		<h1>Quotes</h1>

		<c:if test="${sessionScope.isLoggedIn == true}">
			<form action="/newQuoteServlet" method="get" name="newQuote">
				<input class="btn btn-primary" type="submit" title="newQuote" value="New Quote">
			</form>
			<br/>
		</c:if>

		<table id="quoteTable">
			<c:forEach items="${theQuotes }" var="aQuote">
				<tr>
					<td>${ aQuote.id }</td>
					<td>${ aQuote.quote }</td>
					<td>${ aQuote.author }</td>
				</tr>
			</c:forEach>
		</table>

<%--
		<table id="quoteTable" class="table table-striped">
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
						<c:set var="quoteID" scope="page" value="${ aQuote.id }"/>

							<form action="<c:url value=/EditQuoteServlet"/>" method="GET" name="editQuote">
								<input type="hidden" name="quoteNumberToEdit" value="${ quoteID }">
								<button type="submit" class="btn btn-primary btn-xs">Edit</button>
							</form>

							<c:url var="editURL" value="/EditQuoteServlet?id=${ quoteID }"/>
							<a href="${ editURL }" class="btn btn-primary btn-xs">Edit</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
--%>




</jsp:attribute>
</my:layout>























