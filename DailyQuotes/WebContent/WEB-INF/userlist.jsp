<%@taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c1"%><%@ page language="java" contentType="text/html; charset=UTF-8"
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

<title>Users</title>
</head>
<body>
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
	        <li >
	        	<a href="/">Quotes</a>
	        </li>
	        <li class="active">
	        	<a href="/usersServlet">Users</a>
	        </li>
	      </ul>
	      <ul class="nav navbar-nav navbar-right">
		        <li>
		        	<a id="logoutNavBtn" href="/logoutServlet">Logout</a>
		        </li>
		  </ul>

	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
	<div class="container">
	<h1>Users of the Daily Quotes Program</h1>

		<c:if test="${sessionScope.isLoggedIn == true}">
			<form action="newUserServlet" method="get" name="newUser">
				<input class="btn btn-primary" type="submit" title="newUser" value="New User">
			</form>
			<br/>
		</c:if>
		<table class="table table-striped">
			<c:forEach items="${theUsers }" var="aUser">
				<tr>
					<td>
						<blockquote class="blockquote">
							<p>${aUser.id } - ${aUser.username }</p>
						</blockquote>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>









