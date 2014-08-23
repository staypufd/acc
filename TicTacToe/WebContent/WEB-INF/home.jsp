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
		
		<c:if test="${tie == true }">
			<h2>
				We have a tie!
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
									<!-- 
									The INPUT tag below is useful for debugging as it will show you the coordinates and piece value.
									To use it, comment out the <button> tag and then uncomment the <input> tag.
									-->
									<!--   <INPUT TYPE="SUBMIT" name="rowColPiece" VALUE="${row},${col},${board.getMove(row, col).piece}" > -->  
									<button name="rowColPiece" value="${row},${col},${board.getMove(row, col).piece}" >
										<c:choose>
										    <c:when test= "${board.getMove(row, col).piece == \"EMPTY\"}">
										       &nbsp;-&nbsp;
										    </c:when>
										    <c:otherwise>
										        ${board.getMove(row, col).piece}
										    </c:otherwise>
										</c:choose>
									</button> 
								</form>
							</td>
			
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>