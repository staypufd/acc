package edu.austincc.tictactoe.domain;


/*
 * NOTE:	To class of summer 2014.  This code has been refactored to use a Enum
 * 			for the Move value instead of a String.
 * 
 * Doing so lets us get rid of the piece validation code and the associated 
 * exception we threw if the Move was constructed with a wrong value.  
 * The compiler will not all you to write code to call the Move constructor with 
 * an invalid enum instance for the piece, so we don't need the exception or to throw it anymore.
 * 
 */

public class Move {


	private int row;
	private int column;

	private Enum<Piece> piece;
	
	public Move(int row, int column, Enum<Piece> piece) {
		this.row = row;
		this.column = column;
		this.piece = piece;
	}
	
	public Enum<Piece> getPiece() {
		return piece;
	}
	
	public void setPiece(Enum<Piece> piece) {
		this.piece = piece;
	}

	// Getter Methods
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	
	// Helper Methods
	public String getRowAsString() {
		return new Integer(row).toString();
	}
	
	public String getColumnAsString() {
		return new Integer(column).toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Move [row=").append(row).append(", column=")
				.append(column).append(", piece=").append(piece).append("]");
		return builder.toString();
	}
}
