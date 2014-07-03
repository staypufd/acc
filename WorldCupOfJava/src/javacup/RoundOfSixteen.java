/**
 * 
 */
package javacup;

/**
 * @author samjr
 *
 */
public class RoundOfSixteen extends Round {

	RoundOfEight bracketA;
	RoundOfEight bracketB;
	
	
	
	/**
	 * @param bracketA
	 * @param bracketB
	 */
	public RoundOfSixteen(RoundOfEight bracketA, RoundOfEight bracketB) {
		super();
		this.bracketA = bracketA;
		this.bracketB = bracketB;
	}



	@Override
	public Team playTournament() {
		Team winnerA = bracketA.playTournament();
		System.out.println("Bracket winner is " + winnerA);
		
		Team winnerB = bracketB.playTournament();
		System.out.println("Bracket winner is " + winnerB);
		
		Match sixteenMatch = new Match(winnerA, winnerB);
		Team winner = sixteenMatch.play();
		System.out.println(sixteenMatch.speak());
		
		System.out.println("Round of sixteen winner is " + winner);
		return winner;
	}

}
