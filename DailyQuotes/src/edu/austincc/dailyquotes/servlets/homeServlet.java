package edu.austincc.dailyquotes.servlets;

import java.io.IOException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import edu.austincc.dailyquotes.domain.Quote;
import edu.austincc.dailyquotes.managers.QuotesManager;

/**
 * Servlet implementation class DailyQuotesHomeServlet
 */
@WebServlet(description = "Main home page for our Daily Quotes Application", 
			urlPatterns = { "/homeServlet", ""})
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Resource(name="jdbc/DB")
	DataSource ds;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append(Quote.testQuote().toString());
		
		QuotesManager qm = new QuotesManager(ds);
		request.setAttribute("theQuotes", qm.getQuotes());
		
		getServletContext().getRequestDispatcher("/WEB-INF/quotelist.jsp").forward(request, response);
		return;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}










