<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
      
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet" type="text/css" href="game.css">
	
	<title>Tic Tac Toe Game</title>
	</head>
	<body>
		<h1>Tic Tac Toe!</h1>
		
		<c:if test="${winner == true }">
			<h2>
				Winner is: <c:out value=" ${winningTeam }"></c:out>
				<form method="post" ACTION="HomeServlet">
					<INPUT TYPE="SUBMIT" name="reset" VALUE="New Game">
				</form>
			</h2>
		</c:if>
	
		<table class="gameTable">
			<c:forEach begin="0" end="${board.dimension -1 }" step="1" var="row">
				<tr>
					<c:forEach begin="0" end="${board.dimension - 1 }" step="1" var="col">
		
							<td>
								<form method="post" ACTION="HomeServlet">
									<INPUT TYPE="SUBMIT" name="rowColPiece" VALUE="${row},${col},${board.getMove(row, col).piece}" >
								</form>
							</td>
			
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>