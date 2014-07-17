package com.austincc.java3.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.austincc.java3.projects.domain.Person;

/**
 * Servlet implementation class PostServletExample
 */
@WebServlet("/POSTExampleServlet")
public class POSTExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public POSTExampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		printOutRequestParameters(request, response);
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/index.html";
		
		// Find out what action was requested
		String action = request.getParameter("action");
		if(action == null) {
			action="showMain";
		}
		
		//Do the action and set which URL we need to go to after we're done
		if(action.equalsIgnoreCase("showMain")) {
			url = "/index.html";
		}
		else if (action.equalsIgnoreCase("addCouponSubscriber")) {
			// get the request parameters
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			
			// Simulate storing to a db...
			Person p = new Person();
			p.setFirstName(firstName);
			p.setLastName(lastName);
			p.setEmail(email);
			
			// Simulate call to db to sore Person instance
			System.out.println("Storing to db...");
			
			// Set the person instance on the request object and set the url to forward too
			request.setAttribute("person", p);
			url = "/thankyou.jsp";
		}
		
		// forward request and response objects to the specified URL
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);
		
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
