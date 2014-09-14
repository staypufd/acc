/**
 *
 */
package edu.austincc.dailyquotes.managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

			PreparedStatement ps = connection.prepareStatement("select id, username, password from users");
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				users.add(new User(resultSet.getInt("id"),
									resultSet.getString("username"),
									resultSet.getString("password")));
			}

			resultSet.close();
			ps.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}


	public boolean addUser(User aUser)  {
		// TODO - Put the user in the user db
		// FIXME - This has a bug

		// Example with data from SQL Script
		// insert into users (username, password) values ('sam', 'abcd');
		boolean added = false;
		try {
			Connection connection;
			connection = ds.getConnection();

			String uname = aUser.getUsername();
			String upass = aUser.getPassword();

			PreparedStatement prepStatement = connection.prepareStatement("insert into users (username, password) values (?, ?)");

			prepStatement.setString(1, uname);
			prepStatement.setString(2, upass);

			prepStatement.execute();


			prepStatement.close();
			connection.close();

			added = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return added;
	}

}







