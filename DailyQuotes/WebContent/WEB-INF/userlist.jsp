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

	<%@ include file="navbar.jsp" %>

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

<%@ include file="footer.jsp" %>

</body>
</html>









