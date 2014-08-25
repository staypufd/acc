package edu.austincc.dailyquotes.managers;

import java.util.ArrayList;

import edu.austincc.dailyquotes.domain.Quote;

public class QuotesManager {
	public ArrayList<Quote> getQuotes() {
		ArrayList<Quote> quotes = new ArrayList<>();
		quotes.add(this.getQuote1());
		quotes.add(this.getQuote2());
		quotes.add(this.getQuote3());
		return quotes;
	}
	
	private Quote getQuote1() {
		Quote q =  new Quote();
		q.setAuthor("Einstein");
		q.setQuote("The hardest thing in the world to understand is the income tax.");
		return q;
	}
	
	private Quote getQuote2() {
		Quote q =  new Quote();
		q.setAuthor("Einstein");
		q.setQuote("The only thing that interferes with my learning is my education.");
		return q;
	}
	
	private Quote getQuote3() {
		Quote q =  new Quote();
		q.setAuthor("Einstein");
		q.setQuote("I am convinced that He (God) does not play dice.");
		return q;
	}
}
