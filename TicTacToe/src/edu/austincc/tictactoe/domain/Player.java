package edu.austincc.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
	
	Enum<Piece> team;
	int gameBoardSize;

	public Player(Enum<Piece> p, int boardSize) {
		team = p;
		gameBoardSize = boardSize;
	}

	public void nextMove(Board theGameBoard) {
		
		// Choose a random move out of the ones still avaialble
		List<Move> listOfAvailableAMoves = theGameBoard.getAvailableMoves();
		
		Random r = new Random();
		if ( listOfAvailableAMoves.size() != 0) {
			int emptyMoveIndexToTake = r.nextInt(listOfAvailableAMoves.size());
			Move aMove = listOfAvailableAMoves.get(emptyMoveIndexToTake);
			// Change the move to be my teams piece
			aMove.setPiece(team);
		}
	
		
	}
	

}
