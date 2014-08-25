package edu.austincc.tictactoe.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.austincc.tictactoe.domain.Board;

/**
 * Servlet implementation class ResetGameServlet
 */
@WebServlet("/ResetGameServlet")
public class ResetGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetGameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Getting the session
		HttpSession session = request.getSession();
		
		// Handle reset board request
		String reset = request.getParameter("reset");
		if ( (reset != null) ) {
			if ( reset.equalsIgnoreCase("new game") ) {
				if ( session.getAttribute("board") != null ) {
					Board b = (Board)session.getAttribute("board");
					b.clear();
				}
				getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
				return;
			}
		}
	}

}
