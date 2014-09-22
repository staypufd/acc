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
 * Servlet implementation class EditQuoteServlet
 */
@WebServlet("/EditQuoteServlet")
public class EditQuoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name="jdbc/DB")
	DataSource ds;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditQuoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idString = request.getParameter("id");

		request.setAttribute("id", idString);
		QuotesManager qm = new QuotesManager(ds);
		Quote quoteToEdit = qm.getQuoteById(idString);

		request.setAttribute("quote", quoteToEdit);

		request.getRequestDispatcher("/WEB-INF/editquote.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");

		if ( action.equalsIgnoreCase("updateQuote") ) {
			String quoteID = request.getParameter("id");
			String quote = request.getParameter("quote");
			String author = request.getParameter("author");

			Quote myUpdatedQuote = new Quote(new Integer(quoteID), quote, author);

			QuotesManager qm = new QuotesManager(ds);
			if ( qm.updateQuote(myUpdatedQuote) ) {
				response.sendRedirect("");
				return;
			} else {
				// If save didn't work then go back to the newquote page
				request.setAttribute("error", "Quote didn't update! Try again");
				request.getRequestDispatcher("/WEB-INF/quotelist.jsp").forward(request, response);
			}

		}


	}

}
