<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Page</title>
<!--  <link rel="stylesheet" href="/css/bootstrap.css" />  -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">


</head>
<body>
	<sql:query dataSource="jdbc/testDB" sql="select * from people"
		var="results"></sql:query>

	<div class="jumbotron">
		<h1>Peoples</h1>
	</div>

	<div class="container">
		<c:forEach items="${results.rows}" var="person">
			<blockquote>
				<p>${person.name}</p>
				<footer>${person.age}</footer>
			</blockquote>
		</c:forEach>
	</div>

	<div class="container">
		<footer>
			<p>The quote database contains ${fn:length(results.rows)} people.</p>
		</footer>
	</div>

	<script src="/js/bootstrap.js"></script> 
</body>
</html>