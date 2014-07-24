package com.austincc.java3.jstlproject.servlets.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.austincc.java3.jstlproject.domain.SweetsStore;

/**
 * Application Lifecycle Listener implementation class CookieStoreAppLIstener
 *
 */
@WebListener
public class CookieStoreAppLIstener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public CookieStoreAppLIstener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	// Create our application cookie store and put it in the app context
    	sce.getServletContext().setAttribute("cookiestore", new SweetsStore());
    }

}
