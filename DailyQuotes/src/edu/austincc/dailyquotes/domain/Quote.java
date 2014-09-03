/**
 * 
 */
package edu.austincc.dailyquotes.domain;

import java.util.Date;

/**
 * @author samjr
 *
 */
public class Quote {

		int id;
		private String quote;
		private String author;
		
		public Quote(String quote, String author) {
			this.quote = quote;
			this.author = author;
		}
		
		public Quote(int id, String quote, String author) {
			this.id = id;
			this.quote = quote;
			this.author = author;
		}

		// Class Methods
		public static Quote testQuote() {
			
			Quote aQuote = new Quote(-1, "The hardest thing in the world to understand is the income tax.", "Einstein");
			return aQuote;
		}
		
		// Instance Methods
		
		// Getters & Setters
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the quote
		 */
		public String getQuote() {
			return quote;
		}

		/**
		 * @param quote the quote to set
		 */
		public void setQuote(String quote) {
			this.quote = quote;
		}
		/**
		 * @return the author
		 */
		public String getAuthor() {
			return author;
		}
		/**
		 * @param author the author to set
		 */
		public void setAuthor(String author) {
			this.author = author;
		}

		

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Quote [quote=").append(quote).append(", author=")
					.append(author)
					.append("]");
			return builder.toString();
		}
		


	
}













