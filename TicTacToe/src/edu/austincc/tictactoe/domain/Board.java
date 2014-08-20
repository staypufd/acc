package edu.austincc.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;
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
	
	private int dimension;
	
	private Enum<Piece> winningTeam = Piece.EMPTY;
	
	// Standard Tic-Tac-Toe size board
	public Board() {
		this(3);
	}
	
	// Boards can be other sizes as well.
	public Board(int boardDimension) {
		dimension = boardDimension;
		moves = new Move[boardDimension][boardDimension];
		this.clear();
	}
	
	// Clear the board by putting Empty everywhere
	public void clear() {
		for (int i = 0; i < this.dimension; i++) {
			for (int j = 0; j < this.dimension; j++) {
				moves[i][j] = new Move(i, j, Piece.EMPTY);
			}
		}
	}
	
	public ArrayList<Move> getMoves() {
		ArrayList<Move> theMoves = new ArrayList<Move>();
		
		for (Move[] moves2 : moves) {
			for (Move move : moves2) {
				theMoves.add(move);
				
			}
		}
		
		return theMoves;
	}
	
	public ArrayList<Move> getAvailableMoves() {
		ArrayList<Move> availableMoves = new ArrayList<Move>();
		
		for (Move[] moves2 : moves) {
			for (Move move : moves2) {
				if (move.getPiece() == Piece.EMPTY) {
					availableMoves.add(move);
				}
			}
		}
		
		return availableMoves;
		
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
	
	public void makeMove(Move m) throws BadRowOrColumnIndex {
		// put the move into board
		if (m.getRow() >= dimension) {
			throw new BadRowOrColumnIndex(m.getRowAsString());
		}
		if (m.getColumn() >= dimension) {
			throw new BadRowOrColumnIndex(m.getColumnAsString());
		}
		moves[m.getRow()][m.getColumn()] = m;
	}
	
	
	// Random Team is always O.  This is hard-coded but should be a game parameter for later
	// TODO - Fix this to not always be set to O's when doing a two player game
	public void makeRandomMove() {
		// Choose a random move out of the ones still avaialble
				List<Move> listOfAvailableAMoves = getAvailableMoves();
				
				Random r = new Random();
				if ( listOfAvailableAMoves.size() != 0) {
					int emptyMoveIndexToTake = r.nextInt(listOfAvailableAMoves.size());
					Move aMove = listOfAvailableAMoves.get(emptyMoveIndexToTake);
					// Change the move to be my teams piece
					aMove.setPiece(Piece.O);
				}
	}
	
	public Move getMove(int x, int y) {
		// use the x and y to look into our state
		// and return the Move at that spot
		
		return moves[x][y];
	}
	
	public int getDimension() {
		return dimension;
	}

	
	public Enum<Piece> getWinningTeam() {
		return winningTeam;
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
				if (move.getPiece() == Piece.EMPTY) {
					arraySB.append(".");
				} else {
					arraySB.append(move.getPiece());
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
		for (int i = 0; i < dimension; i++) {
			Enum<Piece> p = moves[i][i].getPiece();
			diagonal.add(p);
		}
		
		if ( allMovesTheSameExcludingEmptyValues(diagonal) ) {
			return true;
		}
			
		
		// We're reusing the ArrayList at this point so clear (empty) it
		diagonal.clear();
		
		// Second diagonal -- top-right down to bottom-left
		for (int col = 0; col < dimension; col++) {
			int rowX = (dimension - 1) - col;
			int rowY = col;
			Enum<Piece> p = moves[rowX][rowY].getPiece();
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
		for (int col = 0; col < dimension; col++ ) {
			ArrayList<Enum<Piece>> columnValues = new ArrayList<>();
			// Go to each row for this column
			for (int row = 0; row < dimension; row++) {
				Enum<Piece> val = moves[row][col].getPiece();
				columnValues.add(val);
			}
			// if they are all empty it's not a winner
			// else if they are all the same.
			if ( allMovesTheSameExcludingEmptyValues(columnValues) ) {
				anyColumnIsAWinner = true;
				return anyColumnIsAWinner;
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
				rowPieces.add(move.getPiece());
			}
			if ( allMovesTheSameExcludingEmptyValues(rowPieces)) {
				anyRowIsAWinner = true;
				return anyRowIsAWinner;
			}
		}
		
		return anyRowIsAWinner;
	}
	
	// Are all the values the same?  Empty values ares still considered false.
	@SuppressWarnings("unchecked")
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
			Object[] w = isSameSet.toArray();
			this.winningTeam = (Enum<Piece>)(w[0]);
			return true;
		}
		
	}
	
	
	
	/* *******************************************************************************
	 * Testing and Simulation Helper Methods
	 * *******************************************************************************
	 */
	
	
	/*
	 * Random Board Generator
	 * NOTE:  Not all random boards will be valid Tic-Tac-Toe games
	 */
	public void randomBoard() {
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < moves.length; j++) {
				// Get a random number between 0 and 2. ** Read doc for nextInt() method **
				Random r = new Random();
				int intValue = r.nextInt(getDimension());
				
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
			makeMove(new Move(0, 0, Piece.O));
			makeMove(new Move(1, 0, Piece.O));
			makeMove(new Move(2, 0, Piece.O));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.EMPTY));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.EMPTY));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.EMPTY));
			
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
			makeMove(new Move(0, 0, Piece.EMPTY));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.EMPTY));
			
			makeMove(new Move(0, 1, Piece.O));
			makeMove(new Move(1, 1, Piece.O));
			makeMove(new Move(2, 1, Piece.O));
			
			makeMove(new Move(0, 2, Piece.EMPTY));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.EMPTY));
			
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
			makeMove(new Move(0, 0, Piece.EMPTY));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.EMPTY));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.EMPTY));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.O));
			makeMove(new Move(1, 2, Piece.O));
			makeMove(new Move(2, 2, Piece.O));
			
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
			makeMove(new Move(0, 0, Piece.O));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.EMPTY));
			
			makeMove(new Move(0, 1, Piece.O));
			makeMove(new Move(1, 1, Piece.EMPTY));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.O));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.EMPTY));
			
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
			makeMove(new Move(0, 0, Piece.EMPTY));
			makeMove(new Move(1, 0, Piece.O));
			makeMove(new Move(2, 0, Piece.EMPTY));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.O));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.EMPTY));
			makeMove(new Move(1, 2, Piece.O));
			makeMove(new Move(2, 2, Piece.EMPTY));
			
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
			makeMove(new Move(0, 0, Piece.EMPTY));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.O));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.EMPTY));
			makeMove(new Move(2, 1, Piece.O));
			
			makeMove(new Move(0, 2, Piece.EMPTY));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.O));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}
	
	public void topLeftBottomRightOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			makeMove(new Move(0, 0, Piece.O));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.EMPTY));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.O));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.EMPTY));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.O));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}
	
	public void topRightBottomLeftOs() {
		
		// Test Board you can change to whatever config you want.
		// Each block of 3 is a column.  The second number is the column.
		// Notice that all the column numbers in each group of three are teh same
		try {
			makeMove(new Move(0, 0, Piece.EMPTY));
			makeMove(new Move(1, 0, Piece.EMPTY));
			makeMove(new Move(2, 0, Piece.O));
			
			makeMove(new Move(0, 1, Piece.EMPTY));
			makeMove(new Move(1, 1, Piece.O));
			makeMove(new Move(2, 1, Piece.EMPTY));
			
			makeMove(new Move(0, 2, Piece.O));
			makeMove(new Move(1, 2, Piece.EMPTY));
			makeMove(new Move(2, 2, Piece.EMPTY));
			
		} catch (BadRowOrColumnIndex e) {
			System.out.println("Can't put a move at " + e.getMessage() + " row or column.");
			// e.printStackTrace();
		}

	}


} // End Board Class
