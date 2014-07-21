package com.austincc.java3;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.Regexp;

import com.austincc.java3.domain.Person;

/**
 * Servlet implementation class ValidateCouponSignupServlet
 */
@WebServlet("/ValidateCouponSignupServlet")
public class ValidateCouponSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateCouponSignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Default url
		String url = "/index.jsp";
		// Default message
		String message = "";
		
		// Find out what action was requested
		String action = request.getParameter("action");
		if(action == null) {
			action="showMain";
		}
		
		//Do the action and set which URL we need to go to after we're done
		if(action.equalsIgnoreCase("showMain")) {
			url = "/index.jsp";
			message = ""; 
		}
		else if (action.equalsIgnoreCase("addCouponSubscriber")) {
			// get the request parameters
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			

			// Is all data there?
			if ( (firstName == null) || (lastName == null) || (email == null) ||
				 (firstName.isEmpty()) || (lastName.isEmpty()) || (email.isEmpty()) ) {
				message = "Please enter all the data fields!";
				url = "/index.jsp";
			} // Is the email address a valid email address?
			  else if (!isEmailOk(email)) {
				message = "bad email address";
				url = "/index.jsp";
			} else {

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
				message = "";
			}

		}
		
		// Add the message to the request
		request.setAttribute("message", message);

		
		// Log the request attributes
		log("*** Request Attributes and values ***");
		Enumeration<String> names = request.getAttributeNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			log("Attribute " + name + " has value " + request.getAttribute(name));
		}

		
		
		// forward request and response objects to the specified URL
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);
		
	}
	
	
	// Use a regular expresion to check the email address
	private boolean isEmailOk(String email) {
		String EMAIL_PATTERN = 
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
