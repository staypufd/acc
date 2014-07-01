package javacup;

public class RoundOfEight {
	RoundOfFour bracketA;
	RoundOfFour bracketB;
	
	public RoundOfEight(RoundOfFour bracketA, RoundOfFour bracketB) {
		super();
		this.bracketA = bracketA;
		this.bracketB = bracketB;
	}

	@Override
	public String toString() {
		return "RoundOfEight [bracketA=" + bracketA + ", bracketB=" + bracketB
				+ "]";
	}
	
	public Team playTournament() {
		Team winnerA = bracketA.playTournament();
		System.out.println("Bracket winner is " + winnerA);
		
		Team winnerB = bracketB.playTournament();
		System.out.println("Bracket winner is " + winnerB);
		
		Match eightMatch = new Match(winnerA, winnerB);
		Team winner = eightMatch.play();
		
		System.out.println("Round of eight winner is " + winner);
		return winner;
	}
	

}
