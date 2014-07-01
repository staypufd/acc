package javacup;

public class RoundOfFour {
	Team team1;
	Team team2;
	Team team3;
	Team team4;
	
	public RoundOfFour(Team team1, Team team2, Team team3, Team team4) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
	}

	@Override
	public String toString() {
		return "Tournament [team1=" + team1 + ", team2=" + team2 + ", team3="
				+ team3 + ", team4=" + team4 + "]";
	}
	
	public Team playTournament() {
		Match match1 = new Match(team1, team4);		
		Team winner1 = match1.play();
		System.out.println("Match winner is " + winner1);
		
		Match match2 = new Match(team2, team3);
		Team winner2 = match2.play();
		System.out.println("Match winner is " + winner2);
		
		Match finals = new Match(winner1,winner2);
		Team finalsWinner = finals.play();
		System.out.println("Match winner is " + finalsWinner);	
		
		return finalsWinner;	
	}
	
	

}
