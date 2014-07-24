package com.austincc.java3.jstlproject.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.Cookies;

import com.austincc.java3.jstlproject.domain.Cookie;
import com.austincc.java3.jstlproject.domain.Cookie.CookieType;
import com.austincc.java3.jstlproject.domain.SweetsStore;

/**
 * Servlet implementation class ListCookies
 */
@WebServlet("/cookies")
public class ListCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("cookieTypes", Cookie.CookieType.values());
		getServletContext().getRequestDispatcher("/WEB-INF/cookieslist.jsp").forward(request, response);
		
	}

}
