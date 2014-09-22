<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<my:layout>
<jsp:attribute name="body">

	<div class="container">
		<h2>Add a New User</h2>

		<p class="bg-danger">${errorMessage}</p>

		<form  role="form" action="newUserServlet" method="post" >
			<input type="hidden" name="action" value="addNewUser">
			<div class="form-group">
				<label for="username">User</label>
				<input id="username" type="text" name="username" placeholder="Username" > <br>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input id="password" type="text" name="password" placeholder="Password" > <br>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</jsp:attribute>
</my:layout>
