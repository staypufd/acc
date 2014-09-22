<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="body" fragment="true" %>

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

	<%@ include file="/WEB-INF/navbar.jsp" %>

	<c:if test="${ not empty error }">
		<h3 style="color:red;">Error:  ${error }</h3>
	</c:if>

	<jsp:invoke fragment="body"></jsp:invoke>

	<!-- JQuery -->
	<script src="<c:url value="/jquery/jquery-2.1.1.js"/>"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="<c:url value="/bootstrap-3.2-3.0-dist/js/bootstrap.min.js"/>"></script>

	<%@ include file="/WEB-INF/footer.jsp" %>

	<script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

	<script>
		$(document).ready(function(){
	    	$('#quoteTable').DataTable();
		});
	</script>

</body>
</html>

