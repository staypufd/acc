package edu.austincc.dailyquotes.managers.exceptions;

import java.sql.SQLException;

public class UserCouldNotBeAddedExeception extends Exception {

	public UserCouldNotBeAddedExeception(SQLException e) {
		// TODO Auto-generated constructor stub
		super(e);
	}

}
