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

<%--
	We moved these <script> tags down to the bottom at the body tag
	so that content is loaded before interactivity.

<!-- JQuery -->
<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

 --%>

<title>Daily Quotes</title>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.isLoggedIn != true}">
		<nav class="navbar navbar-default" role="navigation">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Daily Quotes</a>
		    </div>
			<!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav navbar-right">
		        <li class="active">
		        	<a id="loginNavBtn" href="/loginServlet">Login</a>
		        </li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
	</c:when>
    <c:otherwise>
        <nav class="navbar navbar-default" role="navigation">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#">Daily Quotes</a>
		    </div>

		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li class="active">
		        	<a id="quotesNavBtn" href="/">Quotes</a>
		        </li>
		        <li>
		        	<a id="usersNavBtn" href="/usersServlet">Users</a>
		        </li>
		      </ul>
		      <ul class="nav navbar-nav navbar-right">
		        <li>
		        	<a id="logoutNavBtn" href="/logoutServlet">Logout</a>
		        </li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
    </c:otherwise>
</c:choose>


</nav>
	<div class="container">
		<h1>Today's Quotes</h1>

		<c:if test="${sessionScope.isLoggedIn == true}">
			<form action="newQuoteServlet" method="get" name="newQuote">
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

	<!-- JQuery -->
	<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

</body>
</html>






















