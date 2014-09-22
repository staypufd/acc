package edu.austincc.dailyquotes.managers;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import edu.austincc.dailyquotes.domain.Quote;

public class QuotesManager {
	DataSource ds;

	public QuotesManager(DataSource ds) {
		this.ds = ds;
	}

	public ArrayList<Quote> getQuotes() {
		ArrayList<Quote> quotes = new ArrayList<>();


		try {
			Connection connection;
			connection = ds.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id, quotation, author from quotes");

			while (resultSet.next()) {
				quotes.add(new Quote(resultSet.getInt("id"), resultSet.getString("quotation"), resultSet.getString("author")));
			}

			resultSet.close();
			statement.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return quotes;
	}

	public boolean saveQuote(Quote aQuote) {
		boolean succeeded = false;


		try {
			boolean theResult;
			int updateCount;
			Connection connection;
			connection = ds.getConnection();
			Statement statement = connection.createStatement();


			// Read the docs for the execute method below to understand what the boolean returned means
			// Here we use if for the updateCount, but it has another meaning if it's true, so read about it.
			theResult = statement.execute("insert into quotes (quotation, author) values ('" + aQuote.getQuote() + "', '" + aQuote.getAuthor() +"')");
			if (theResult == false) {
				// Result count should be 1;
				updateCount = statement.getUpdateCount();
				if ( updateCount == 1) {
					succeeded = true;
				}

			}

			statement.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return succeeded;
	}

	public Quote getQuoteById(String idString) {

		Connection c;
		Quote returnQuote = null;
		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement("select id, quotation, author from quotes where id = ?");
			ps.setString(1, idString);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String quoteString = rs.getString("quotation");
				String authorString = rs.getString("author");

				returnQuote = new Quote(id, quoteString, authorString);
			}

			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnQuote;
	}

	public boolean updateQuote(Quote myUpdatedQuote) {
		Connection c;
		boolean updateSucceeded = false;

		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement("update QUOTES SET quotation=?, author=? WHERE id = ?");
			ps.setString(1, myUpdatedQuote.getQuote());
			ps.setString(2,  myUpdatedQuote.getAuthor());
			ps.setInt(3, myUpdatedQuote.getId());

			ps.execute();

			c.close();
			updateSucceeded = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return updateSucceeded;
		}


		return updateSucceeded;
	}



}












