<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
      	
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bobs Page</title>
</head>
<body>
	<p>Hello Bob has child <c:out value="${child}"></c:out></p>
	<p>Hello Bob has child <c:out value="${chicken}" default="Duck"></c:out></p>
	<p>Hello Bob has child ${child}</p>
	
	
	<c:set var="salary" scope="session" value="${2000*2}"/>
	Salary is: <c:out value="${salary}"/>
	
	<a href="?action=showsalary">Show Salary Is Session Scoped!</a>
	
	
	
<c:catch var ="catchException">
   <% int x = 5/0;%>
</c:catch>

<c:if test = "${catchException != null}">
   <p>The exception is : ${catchException} <br />
   There is an exception: ${catchException.message}</p>
</c:if>

<c:choose>
    <c:when test="${salary <= 0}">
       Salary is very low to survive.
    </c:when> 
    <c:when test="${salary > 1000}">
        Salary is very good.
    </c:when>
    <c:otherwise>
        No comment sir...
    </c:otherwise>
</c:choose>
	

<c:forEach var="i" begin="1" end="5">
   Item <c:out value="${i}"/><p>
</c:forEach>	
	
<c:forTokens items="Zara,nuha,roshy Blah,Zoom" delims="," var="name">
   <c:out value="${name}"/><p>
</c:forTokens>
	
<c:url value="importtest.jsp" var="myURL">
   <c:param name="trackingId" value="1234"/>
   <c:param name="reportType" value="summary"/>
   <c:param name="action" value="importtest"/>
</c:url>
<a href="${myURL}"/>Go To importtest.jsp</a>	
	
	
</body>
</html>