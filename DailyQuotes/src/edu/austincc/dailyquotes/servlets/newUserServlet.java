package edu.austincc.dailyquotes.servlets;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import edu.austincc.dailyquotes.domain.User;
import edu.austincc.dailyquotes.managers.UsersManager;

/**
 * Servlet implementation class newUserServlet
 */
@WebServlet("/newUserServlet")
public class newUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name="jdbc/DB")
	DataSource ds;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public newUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/newUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		if ( action.equalsIgnoreCase("addNewUser") ) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			User myNewUser = new User(username, password);
			UsersManager qm = new UsersManager(ds);

			boolean succeeded = qm.addUser(myNewUser);
			if ( succeeded == true ) {
				response.sendRedirect("");
				return;
			} else {
				request.setAttribute("errorMessage", "Could not add user. Try again!");
				// If save didn't work then go back to the newUser page
				request.getRequestDispatcher("/WEB-INF/newUser.jsp").forward(request, response);
			}

			// Adding user worked so display list of users
			request.getRequestDispatcher("/WEB-INF/listusers.jsp");
			return;
		}
	}

}
