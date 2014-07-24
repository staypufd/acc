<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href=<c:url value="/main.css" /> >
<title>Cookies List</title>
</head>
<body>

	<table>
		<c:forEach items='${cookiestore.cookies}' var="mapEntry">
			<tr>
				<td class="cookietype">${mapEntry.key}</td>
			</tr>
			<c:forEach items='${mapEntry.value}' var="c">
				<tr class="cookierow">
					<td align="center" class="cookie">
						<%-- <c:out value="${c.cookieTypeString}"></c:out> --%>
						C - <c:out value="${c.hashCode}"></c:out>
					</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>

</body>
</html>