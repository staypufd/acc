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

		private String quote;
		private String author;
		private Date   quoteDate = null;
		
		// Class Methods
		public static Quote testQuote() {
			
			Quote aQuote = new Quote();
			aQuote.setAuthor("Einstein");
			aQuote.setQuote("The hardest thing in the world to understand is the income tax.");
			return aQuote;
		}
		
		// Instance Methods
		
		// Getters & Setters
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
		/**
		 * @return the quoteDate
		 */
		public Date getQuoteDate() {
			return quoteDate;
		}
		/**
		 * @param quoteDate the quoteDate to set
		 */
		public void setQuoteDate(Date quoteDate) {
			this.quoteDate = quoteDate;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Quote [quote=").append(quote).append(", author=")
					.append(author).append(", quoteDate=").append(quoteDate)
					.append("]");
			return builder.toString();
		}
		


	
}













