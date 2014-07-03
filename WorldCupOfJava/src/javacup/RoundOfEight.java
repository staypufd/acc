package javacup;

public class RoundOfEight extends Round {
	RoundOfFour bracketA;
	RoundOfFour bracketB;
	
	public RoundOfEight(RoundOfFour bracketA, RoundOfFour bracketB) {
		super();
		this.bracketA = bracketA;
		this.bracketB = bracketB;
	}
	
	public RoundOfEight(Team t1, Team t2, Team t3, Team t4, 
			Team t5, Team t6, Team t7, Team t8) {
		
		RoundOfFour roundOfFour1 = new RoundOfFour(t1, t2, t3, t4);
		RoundOfFour roundOfFour2 = new RoundOfFour(t5, t6, t7, t8);
		
		this.bracketA = roundOfFour1;
		this.bracketB = roundOfFour2;

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
