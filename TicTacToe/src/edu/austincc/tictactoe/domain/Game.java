package edu.austincc.tictactoe.domain;

import java.awt.Dimension;

public class Game {
	
	
	// Two Computer Players Play one another
	public static void main(String[] args) {
		
		Board aGameBoard = new Board();
		Player player1 = new Player(Piece.O, aGameBoard.getBoardDimension());
		Player player2 = new Player(Piece.X, aGameBoard.getBoardDimension());
		
		
		// Use these for testing. You may also want to look at JUnit
		//aGameBoard.randomBoard();
		//aGameBoard.firstColumnVertialOs();
		//aGameBoard.secondColumnVertialOs();
		//aGameBoard.thirdColumnVertialOs();
		//aGameBoard.firstRowOs();
		//aGameBoard.secondRowOs();
		//aGameBoard.thirdRowOs();
		//aGameBoard.topLeftBottomRightOs();
		//aGameBoard.topRightBottomLeftOs();
		
		 
		boolean hasWinner = false;
		Player winningPlayer = null;
		
		// Number of Turns is dimensions squared / 2 (the number of players)
		// Example:  3x3 board is 3*3 = 9.  So at 9 turns tbe game is over and it is a tie
		int numTurns = ( aGameBoard.getBoardDimension() * aGameBoard.getBoardDimension() ) ;
		
		do {
			
			player1.nextMove(aGameBoard);
			printGameBoard(aGameBoard);
			numTurns -= 1;
			if ( aGameBoard.hasWinner() ) {
				hasWinner = true;
				winningPlayer = player1;
				break;
			} else {
				player2.nextMove(aGameBoard);
				printGameBoard(aGameBoard);
				numTurns -= 1;
				if ( aGameBoard.hasWinner() ) {
					hasWinner = true;
					winningPlayer = player2;
					break;
				}
			}
			
			
		} while ( hasWinner == false | (numTurns >= 0));
		
		
		if (aGameBoard.hasWinner()) {
			System.out.println(winningPlayer.team + " is a winner!");
			printGameBoard(aGameBoard);
		} else {
			System.out.println("We have a tie!");
			printGameBoard(aGameBoard);
		}
		


	}
	
	private static void printGameBoard(Board aBoard) {
		// Print board out
		System.out.println(aBoard.toString());
	}

}
