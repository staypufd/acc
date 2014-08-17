package edu.austincc.tictactoe.domain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Board {
		
	/*
	 *   Rows go across and columns are down.  
	 *   
	 *   So 0,0 would be top, left 
	 *   
	 *   ----------------------
	 *   | 0, 0 | 0, 1 | 0, 2 |
	 *   |--------------------|
	 *   | 1, 0 | 1, 1 | 1, 2 |
	 *   |--------------------|
	 *   | 2, 0 | 2, 1 | 2, 2 |
	 *   ----------------------
	 *   
	 *   2,2 would be bottom, right
	 *   
	 *   On a standard 3x3 Tic-Tac-Toe board.
	 *   
	 */
	
	Move moves[][];
	
	int rowSize;
	int colSize;
	
	// Standard Tic-Tac-Toe size board
	public Board() {
		this(3);
	}
	
	// Boards can be other sizes as well.
	public Board(int boardSize) {
		rowSize = boardSize;
		colSize = boardSize;
		moves = new Move[boardSize][boardSize];
		this.clear();
	}
	
	// Clear the board by putting Empty everywhere
	public void clear() {
		for (int i = 0; i < this.rowSize; i++) {
			for (int j = 0; j < this.colSize; j++) {
				moves[i][j] = new Move(i, j, Piece.EMPTY);
			}
		}
	}
	
	// Do we have a winner or a tie
	public boolean hasWinner () {
		boolean winner = false;
		
		// Any winner?
		if ( hasWinningRow() | hasWinningColumn() | hasWinningDiagonal() ){
			winner = true;
		}
		
		return winner;
	}
	
	public void setMove(Move m) throws BadRowOrColumnIndex {
		// put the move into board
		if (m.getRow() >= rowSize) {
			throw new BadRowOrColumnIndex(m.getRowAsString());
		}
		if (m.getColumn() >= colSize) {
			throw new BadRowOrColumnIndex(m.getColumnAsString());
		}
		moves[m.getRow()][m.getColumn()] = m;
	}
	
	public Move getMove(int x, int y) {
		// use the x and y to look into our state
		// and return the Move at that spot
		
		return moves[x][y];
	}

	
	/** 
	 * Output helpers for this class.  toString() and helpers for it to use.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board = [ \n").append(toStringArrayHelper(moves))
				.append(" ]");
		return builder.toString();
	}
	
	private String toStringArrayHelper(Move[][] movesArrays) {
		StringBuilder arraySB = new StringBuilder();
		
		for (Move[] movesArray : movesArrays) {
			for (Move move : movesArray) {
				arraySB.append(" ");
				if (move.getValue() == Piece.EMPTY) {
					arraySB.append(".");
				} else {
					arraySB.append(move.getValue());
				}
			}
			arraySB.append("\n");
		}
		
		return arraySB.toString();
	}

	
	/**
	 * Helper methods.  
	 */
	
	private boolean hasWinningDiagonal() {
		ArrayList<Enum<Piece>> diagonal = new ArrayList<Enum<Piece>>();
		
		
		// First diagonal -- top-left down to bottom-right
		for (int i = 0; i < moves.length; i++) {
			Enum<Piece> p = moves[i][i].getValue();
			diagonal.add(p);
		}
		
		if ( allMovesTheSameExcludingEmptyValues(diagonal) ) {
			return true;
		}
			
		
		// We're reusing the ArrayList at this point so clear (empty) it
		diagonal.clear();
		
		// Second diagonal -- top-right down to bottom-left
		for (int col = 0; col < colSize; col++) {
			int rowX = (colSize - 1) - col;
			int rowY = col;
			Enum<Piece> p = moves[rowX][rowY].getValue();
			diagonal.add(p);
		}
		
		if ( allMovesTheSameExcludingEmptyValues(diagonal) ) {
			return true;
		}
		
		// Not all matching
		return false;
	}

	
	private boolean hasWinningColumn() {
		
		boolean anyColumnIsAWinner = false;
		
		// Go thru each column
		for (int col = 0; col < colSize; col++ ) {
			ArrayList<Enum<Piece>> columnValues = new ArrayList<>();
			// Go to each row for this column
			for (int row = 0; row < rowSize; row++) {
				Enum<Piece> val = moves[row][col].getValue();
				columnValues.add(val);
			}
			// if they are all empty it's not a winner
			// else if they are all the same.
			
			
			if ( allMovesTheSameExcludingEmptyValues(columnValues) ) {
				anyColumnIsAWinner = true;
			}
		}
		
		return anyColumnIsAWinner;
	}

	private boolean hasWinningRow() {

		boolean anyRowIsAWinner = false;
		
		// Get a row out of the boards moves
		for (Move[] row : moves) {
			
			ArrayList<Enum<Piece>> rowPieces = new ArrayList<Enum<Piece>>();
			// Add each row item to rowPieces
			for (Move move : row) {
				rowPieces.add(move.getValue());
			}
			if ( allMovesTheSameExcludingEmptyValues(rowPieces)) {
				anyRowIsAWinner = true;
			}
		}
		
		return anyRowIsAWinner;
	}
	
	// Are all the values the same?  Empty values ares still considered false.
	private boolean allMovesTheSameExcludingEmptyValues(ArrayList<Enum<Piece>> arrayOfPieces) 
	{
		// By using a set we can see if there is more than one type of piece
		// Remember Sets only hold one instance of each thing
		// so in this case if all the pieces are the same then only one 
		// type of piece will be in the Set.  This works b/c Pieces are an Enum.
		Set<Enum<Piece>> isSameSet = new TreeSet<Enum<Piece>>();
		isSameSet.addAll(arrayOfPieces);
		
		// If the set is bigger than 1 then it must have multiple types of 
		// Pieces, so they aren't all the same.
		// If the set contains empties then that's the same as false b/c 
		// Empties are not important even if they all match.
		if (isSameSet.size() > 1 | (isSameSet.contains(Piece.EMPTY)) ) {
			return false;
		} else {
			
			return true;
		}
		
	}
	
	
	/*
	 * Random Board Generator
	 * NOTE:  Not all random boards will be valid Tic-Tac-Toe games
	 */
	public void randomBoard() {
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < moves.length; j++) {
				// Get a random number between 0 and 2. ** Read doc for nextInt() method **
				Random r = new Random();
				int intValue = r.nextInt(3);
				
				// Get the Piece from the Piece enum's values list for the random integer
				Enum<Piece> piece = Piece.values()[intValue];
				moves[i][j] = new Move(i, j, piece);
			}
		}
	}
	
	public void firstColumnVertialOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.O));
			setMove(new Move(1, 0, Piece.O));
			setMove(new Move(2, 0, Piece.O));
			
			setMove(new Move(0, 1, Piece.EMPTY));
			setMove(new Move(1, 1, Piece.EMPTY));
			setMove(new Move(2, 1, Piece.EMPTY));
			
			setMove(new Move(0, 2, Piece.EMPTY));
			setMove(new Move(1, 2, Piece.EMPTY));
			setMove(new Move(2, 2, Piece.EMPTY));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}
	
	public void secondColumnVertialOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.EMPTY));
			setMove(new Move(1, 0, Piece.EMPTY));
			setMove(new Move(2, 0, Piece.EMPTY));
			
			setMove(new Move(0, 1, Piece.O));
			setMove(new Move(1, 1, Piece.O));
			setMove(new Move(2, 1, Piece.O));
			
			setMove(new Move(0, 2, Piece.EMPTY));
			setMove(new Move(1, 2, Piece.EMPTY));
			setMove(new Move(2, 2, Piece.EMPTY));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}
	
	public void thirdColumnVertialOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.EMPTY));
			setMove(new Move(1, 0, Piece.EMPTY));
			setMove(new Move(2, 0, Piece.EMPTY));
			
			setMove(new Move(0, 1, Piece.EMPTY));
			setMove(new Move(1, 1, Piece.EMPTY));
			setMove(new Move(2, 1, Piece.EMPTY));
			
			setMove(new Move(0, 2, Piece.O));
			setMove(new Move(1, 2, Piece.O));
			setMove(new Move(2, 2, Piece.O));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}
	
	public void firstRowOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.O));
			setMove(new Move(1, 0, Piece.EMPTY));
			setMove(new Move(2, 0, Piece.EMPTY));
			
			setMove(new Move(0, 1, Piece.O));
			setMove(new Move(1, 1, Piece.EMPTY));
			setMove(new Move(2, 1, Piece.EMPTY));
			
			setMove(new Move(0, 2, Piece.O));
			setMove(new Move(1, 2, Piece.EMPTY));
			setMove(new Move(2, 2, Piece.EMPTY));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}

	public void secondRowOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.EMPTY));
			setMove(new Move(1, 0, Piece.O));
			setMove(new Move(2, 0, Piece.EMPTY));
			
			setMove(new Move(0, 1, Piece.EMPTY));
			setMove(new Move(1, 1, Piece.O));
			setMove(new Move(2, 1, Piece.EMPTY));
			
			setMove(new Move(0, 2, Piece.EMPTY));
			setMove(new Move(1, 2, Piece.O));
			setMove(new Move(2, 2, Piece.EMPTY));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}

	public void thirdRowOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			setMove(new Move(0, 0, Piece.EMPTY));
			setMove(new Move(1, 0, Piece.EMPTY));
			setMove(new Move(2, 0, Piece.O));
			
			setMove(new Move(0, 1, Piece.EMPTY));
			setMove(new Move(1, 1, Piece.EMPTY));
			setMove(new Move(2, 1, Piece.O));
			
			setMove(new Move(0, 2, Piece.EMPTY));
			setMove(new Move(1, 2, Piece.EMPTY));
			setMove(new Move(2, 2, Piece.O));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}


} // End Board Class
