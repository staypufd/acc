package com.austincc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.austincc.servlets.domain.Person;

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
		
		String theAction = request.getParameter("action");
		if (theAction != null) {
			if (theAction.equalsIgnoreCase("gotogoodbye")) {
				getServletContext().getRequestDispatcher("/WEB-INF/goodbye.jsp").forward(request, response);
				return;
			} 
		}
		
		String theAction2 = request.getParameter("action");
		if (theAction2 != null) {
			if (theAction2.equalsIgnoreCase("seeya")) {
				getServletContext().getRequestDispatcher("/WEB-INF/seeya.jsp").forward(request, response);
				return;
			} 
		}
		
		String theAction3 = request.getParameter("action");
		if (theAction3 != null) {
			if (theAction2.equalsIgnoreCase("gotobobs")) {
				String name = (String) request.getParameter("name");
				String child = request.getParameter("child");
				
				request.setAttribute("name", name);
				request.setAttribute("child", child);
				getServletContext().getRequestDispatcher("/WEB-INF/bobs.jsp").forward(request, response);
				return;
			} 
		}
		
		String theAction4 = request.getParameter("action");
		if (theAction4 != null) {
			if (theAction2.equalsIgnoreCase("showsalary")) {
				Person p = new Person();
				p.setName("Sam");
				p.setSalary(2000);
				
				request.setAttribute("person", p);
				getServletContext().getRequestDispatcher("/WEB-INF/showSalaryReallyIsSessionScoped.jsp").forward(request, response);
				return;  
			} 
		}
		
		String theAction5 = request.getParameter("action");
		if (theAction5 != null) {
			if (theAction5.equalsIgnoreCase("importtest")) {
				String trackingId = (String) request.getParameter("trackingId");
				String reportType = request.getParameter("reportType");
				
				request.setAttribute("trackingId", trackingId);
				request.setAttribute("reportType", reportType);
				getServletContext().getRequestDispatcher("/importtest.jsp").forward(request, response);
				return;
			}  
		}
		
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
