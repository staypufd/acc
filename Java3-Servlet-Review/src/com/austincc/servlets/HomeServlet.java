package com.austincc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		String theAction = request.getParameter("action");
//		if (theAction != null) {
//			if (theAction.equalsIgnoreCase("gotogoodbye")) {
//				// getServletContext().getRequestDispatcher("/WEB-INF/goodbye.jsp").forward(request, response);
//				response.sendRedirect("/WEB-INF/goodbye.jsp");
//			}
//		}
		 
		
		// Pull the request parameters out of the request
		String name = (String) request.getParameter("name");
		String ageString = request.getParameter("age");
		
		if (name != null && ageString != null) {
			int age = new Integer(ageString);
			
			request.setAttribute("name", name);
			request.setAttribute("age", age);
		}
		
		
		// Forward to the new page
		getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
