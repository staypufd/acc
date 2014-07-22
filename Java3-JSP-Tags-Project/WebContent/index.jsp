<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Tags Page</title>
</head>
<body>

	<%
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "ABC");
		a.add(1, "DEF");
		a.add(2, "GHI");
		a.add(3, "JKL");
		a.add(4, "MNO");
		
		String name = request.getParameter("name");
	%>

	<p>
		A has a value <span id="arrayValue1"> <%= a.get(0) %>
		</span> and <%= a.get(1) %> that's neat!
	</p>

	<%
		if (name != null && name.equals("Sam Griffith")) {
			name = "Mname != null &&aster of the Universe:  " + name;
	%>
			<p>
				The request name value is:
				<%=name%>
			</p>
	<%
		} 
	%>

	<TABLE>
	<%
	    for ( int i = 0; i < a.size(); i++ ) {
	        %>
	        <TR>
	        <TD>The array string at <%= i %> is: </TD>
	        <TD><%= a.get(i) %></TD>
	        </TR>
	        <%
	    }
	%>
	</TABLE>

</body>
</html>