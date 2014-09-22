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
<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>
--%>

<title>Edit Quote</title>
</head>
<body>

 <%@ include file="navbar.jsp" %>

<div class="container">
	<h2>Edit a Quote</h2>


	<h5>Quote is: <c:out value="${quote }"/></h5>
	<form  role="form" action="/EditQuoteServlet" method="post" >

		<input type="hidden" name="action" value="updateQuote">
		<input type="hidden" name="id" value="${ id }">
<%--
		<div class="form-group">
			<label for="id">ID</label>
			<input id="id" type="text" name="id" value="${ id }"  disabled readonly> <br>
		</div>
--%>
		<div class="form-group">
			<label for="quote">Quote</label>
			<%--
				<input id="quote" type="text" name="quote" value="${ quote.quote }" > <br>
			--%>
			<textarea id="quote" name="quote" rows="4" cols="50"><c:out value="${ quote.quote }"/>
			</textarea>
		</div>
		<div class="form-group">
			<label for="author">Author</label>
			<input id="author" type="text" name="author" value="${ quote.author }" > <br>
		</div>
		<button type="submit" class="btn btn-default">Save</button>
	</form>

</div>
<%--
<!-- JQuery -->
<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>
--%>

	<%@ include file="bootstrap-bottom-of-page-scripts.jsp" %>

	<%@ include file="footer.jsp" %>
</body>
</html>