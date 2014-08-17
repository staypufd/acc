package edu.austincc.tictactoe.domain;

public class Game {
	
	public static void main(String[] args) {
		
		Board aGame = new Board();
		aGame.randomBoard();
		
		// Use these for testing. You may also want to look at JUnit
//		aGame.firstColumnVertialOs();
//		aGame.secondColumnVertialOs();
//		aGame.thirdColumnVertialOs();
//		aGame.firstRowOs();
//		aGame.secondRowOs();
//		aGame.thirdRowOs();
		 
		if (aGame.hasWinner()) {
			System.out.println("We have a winner!");
		} else {
			System.out.println("We have a tie");
		}
		

		// Print board out
		System.out.println(aGame.toString());
	}

}
