<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<my:layout>
<jsp:attribute name="body">

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

</jsp:attribute>
</my:layout>
