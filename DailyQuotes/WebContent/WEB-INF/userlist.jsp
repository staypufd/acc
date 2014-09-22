<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<my:layout>
<jsp:attribute name="body">

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

</jsp:attribute>
</my:layout>









