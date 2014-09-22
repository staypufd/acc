<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>

<my:layout>
<jsp:attribute name="body">

	<h2>Add a New Quote</h2>

	<form  role="form" action="newQuoteServlet" method="post" >
		<input type="hidden" name="action" value="addNewQuote">
		<div class="form-group">
			<label for="quote">Quote</label>
			<input id="quote" type="text" name="quote" placeholder="Quote" > <br>
		</div>
		<div class="form-group">
			<label for="author">Author</label>
			<input id="author" type="text" name="author" placeholder="Author" > <br>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

</jsp:attribute>
</my:layout>
