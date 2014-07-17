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

		
		// If we don't set the content type to text/html then the text gets sent
		// back as just text
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<DOCTYPE! html> <head><title>Intro Servlet</title></head> <body>");
		pw.print("<br/>");
		pw.print("<h1>Intro Serlet Example</h1>");
		pw.print("<h2>- A Study in GET Requests, Responses and Request Parameters</h2>");
		pw.print("<p>This is really cool</p> <a href=\"http://localhost:8080/Java3-IntroServlets/IntroServlet?foo=55\">Call ourseleves with foo=55</a>");
		
		
		String fooValueString = request.getParameter("foo");
		if (fooValueString != null) {
			Float foosValue = new Float(fooValueString);
			
			// To output to the system console
			System.out.println("Foo has a value of: " + foosValue.floatValue());
			
			response.getWriter().println("<p style=\"margin: 10px\"><strong>Foo has a value of: " + foosValue.floatValue() + "</strong></p>");
		}
		String name = request.getParameter("name");
		if (name != null) {
			response.getWriter().println("<p style=\"margin: 10px\">Name is: " + name);
			// To output to the system console
			System.out.println("Name is: " + name);
		}
		String age = request.getParameter("age"); 
		if (age != null) {
			Integer ageValue = new Integer(age);
			response.getWriter().println("<p style=\"margin: 10px\">Age is: " + ageValue + "</p>");
			
			// To output to the system console
			System.out.println("Age has a value of: " + ageValue.intValue());
		}
		
		// Print out the request parameters to help debug
		pw.println("<br><br><hr><h2>Debugging Info</h2>");
		printOutRequestParameters(request, response);
		pw.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
	/*
	 * 
	 * Helper Functions that are useful for debugging
	 * 
	 */

	private void printOutRequestParameters(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter(); 
		pw.print("<table style=\"background-color: grey;text-align:center\"><tr><th style=\"background-color:lightgrey\" colspan=\"2\">Params</th></tr><th>Name</th><th>Value</th>");
		
		// Print out the parameters that we pass with the URL request
		for ( Enumeration<String> enumeration = request.getParameterNames(); enumeration.hasMoreElements(); ) {
			String paramName = (String) enumeration.nextElement();
			String paramValue = request.getParameter(paramName);
			pw.print("<tr><td>" + paramName + "</td><td>" + paramValue + "</td></tr>");
			
			// If you want to send them to the console as well use this 
			// System.out.println(paramName + " has a value of: " + paramValue);
		}
		
		pw.print("</table>");
	}
	
}
