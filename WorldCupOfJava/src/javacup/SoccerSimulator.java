package javacup;

public class SoccerSimulator {
	public static RoundOfFour firstBracket() {
		Team team1 = new Team("USA",     3, 3);
		Team team2 = new Team("Germany", 4, 3);
		Team team3 = new Team("Algeria", 3, 3);
		Team team4 = new Team("Belgium", 4, 4);

		return new RoundOfFour(team1, team2, team3, team4);
	}

	public static RoundOfFour secondBracket() {
		Team team1 = new Team("Nigeria",     3 ,3);
		Team team2 = new Team("Netherlands", 3, 2);
		Team team3 = new Team("Mexico",      3, 2);
		Team team4 = new Team("France",      4, 3);

		return new RoundOfFour(team1, team2, team3, team4);
	}

	public static void main(String[] args) {
		RoundOfEight round = new RoundOfEight(firstBracket(), secondBracket());
		Team winner = round.playTournament();
		
		System.out.println("Congratulations to " + winner);
	}
}
