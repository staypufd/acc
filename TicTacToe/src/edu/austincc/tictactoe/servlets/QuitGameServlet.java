package edu.austincc.tictactoe.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QuitGameServlet
 */
@WebServlet("/QuitGameServlet")
public class QuitGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuitGameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String quit = request.getParameter("quit");
		if ( (quit != null) && ( quit.equalsIgnoreCase("Quit Game")) ) {
			HttpSession session = request.getSession();
			if ( session.getAttribute("board") != null ) {
				 session.removeAttribute("board");
				 getServletContext().getRequestDispatcher("/WEB-INF/quitgame.jsp").forward(request, response);
				 return;
			}
		}
		
	}

}
