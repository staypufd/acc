package edu.austincc.dailyquotes.managers;



import java.sql.Connection;
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
			ResultSet resultSet = statement.executeQuery("select quotation, author from quote");
			
			while (resultSet.next()) {
				quotes.add(new Quote(resultSet.getString("quotation"), resultSet.getString("author")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return quotes;
	}
	
	
}
