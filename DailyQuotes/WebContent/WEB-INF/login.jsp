<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<my:layout>
<jsp:attribute name="body">

	<h2>Login</h2>

	<c:if test="${ not empty error }">
		<h3 style="color:red;">Error:  ${error }</h3>
	</c:if>

	<form  role="form" action="<c:url value="/loginServlet"/>" method="post" >
		<input type="hidden" name="action" value="login">
		<div class="form-group">
			<label for="username">Username</label>
			<input id="username" type="text" name="username" placeholder="Username" > <br>
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input id="password" type="text" name="password" placeholder="Password" > <br>
		</div>
		<button type="submit" class="btn btn-default">Login</button>
	</form>

</jsp:attribute>
</my:layout>
