package edu.austincc.dailyquotes.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Resource(name="jdbc/DB")
	DataSource ds;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			if (username.isEmpty() || password.isEmpty()) {
				request.setAttribute("error", "Username and Password both need to be filled out!");
				request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,	response);
			} else {
				// Check to see if user can login
				if (validLogin(username, password)) {
					//TODO - Put boolean in session
					request.getSession().setAttribute("isLoggedIn", true);
					response.sendRedirect("/");
				} else {
					request.setAttribute("error", "Username and Password has a error!");
					request.getSession().setAttribute("isLoggedIn", false);
					request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
				}
			}
		}
	}


	private boolean validLogin(String username, String password) {
		boolean validUserLogin = false;


		Connection c;
		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement("select count(*) as numMatchingUsers from users where username = ? and password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int numberOfMatchingUsers = rs.getInt("numMatchingUsers");
				if (numberOfMatchingUsers == 1) {
					validUserLogin = true;
				}
			}

			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return validUserLogin;
	}
}
