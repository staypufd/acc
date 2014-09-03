/**
 * 
 */
package edu.austincc.dailyquotes.managers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import edu.austincc.dailyquotes.domain.Quote;
import edu.austincc.dailyquotes.domain.User;

/**
 * @author samjr
 *
 */
public class UsersManager {
	DataSource ds;
	
	public UsersManager(DataSource ds) {
		this.ds = ds;
	}
	
	public ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<>();
		
		try {
			Connection connection;
			connection = ds.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id, username, password from users");
			
			while (resultSet.next()) {
				users.add(new User(resultSet.getInt("id"),
									resultSet.getString("username"), 
									resultSet.getString("password")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}
	
}
