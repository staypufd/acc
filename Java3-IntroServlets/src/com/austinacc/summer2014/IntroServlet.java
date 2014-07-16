package com.austinacc.summer2014;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IntroServlet
 */

// You can test hitting this servlet by going to:
// http://localhost:8080/Java3-IntroServlets/IntroServlet?name=Sam
@WebServlet("/IntroServlet")
public class IntroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IntroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println(request.getRequestURI());
	
		// Print out the parameters that we pass with the URL request
//		for ( Enumeration<String> enumeration = request.getParameterNames(); enumeration.hasMoreElements(); ) {
//			String paramName = (String) enumeration.nextElement();
//			System.out.println(paramName + " has a value of: " + request.getParameter(paramName));
//		}
		
		String fooValueString = request.getParameter("foo");
		if (fooValueString != null) {
			Float foosValue = new Float(fooValueString);
			System.out.println("Foo has a value of: " + foosValue.floatValue());
			
			response.getWriter().println("<strong>Foo has a value of: " + foosValue.floatValue() + "</strong>");
		}
		String name = request.getParameter("name");
		if (name != null) {
			System.out.println("Name is: " + name);
			response.getWriter().println("Name is: " + name);
		}
		String age = request.getParameter("age");
		if (age != null) {
			Integer ageValue = new Integer(age);
			System.out.println("Age has a value of: " + ageValue.intValue());
		}
		
		// response.getWriter().println("This is some boring text");
		
		// If we don't set the content type to text/html then the text gets sent
		// back as just text
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<DOCTYPE! html> <head><title>Intro Servlet</title></head> <body>");
		pw.print("<h1>Title</h1>");
		pw.print("<p>This is really cool</p> <a href=\"http://localhost:8080/Java3-IntroServlets/IntroServlet?foo=55\">Call ourseleves with foo=55</a>");
		pw.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
