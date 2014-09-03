package edu.austincc.dailyquotes.servlets;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import edu.austincc.dailyquotes.domain.Quote;
import edu.austincc.dailyquotes.managers.QuotesManager;

/**
 * Servlet implementation class newQuoteServlet
 */
@WebServlet("/newQuoteServlet")
public class newQuoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/DB")
	DataSource ds;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newQuoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("/WEB-INF/newquote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if ( action.equalsIgnoreCase("addNewQuote") ) {
			String quote = request.getParameter("quote");
			String author = request.getParameter("author");
			
			Quote myNewQuote = new Quote(quote, author);
			QuotesManager qm = new QuotesManager(ds);
			if ( qm.saveQuote(myNewQuote) ) {
				response.sendRedirect("");
				return;
			} else {
				// If save didn't work then go back to the newquote page
				request.getRequestDispatcher("/WEB-INF/newquote.jsp").forward(request, response);
			}
			
		}
	}

}
