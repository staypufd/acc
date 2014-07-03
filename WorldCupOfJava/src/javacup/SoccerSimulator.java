package javacup;

public class SoccerSimulator {
	public static RoundOfEight firstBracket() {
		Team team1 = new Team("USA",     3, 3);
		Team team2 = new Team("Germany", 4, 3);
		Team team3 = new Team("Algeria", 3, 3);
		Team team4 = new Team("Belgium", 4, 4);
		Team team5 = new Team("Foo", 5, 5);
		Team team6 = new Team("Bar", 6, 6);
		Team team7 = new Team("Baz", 7, 7);
		Team team8 = new Team("Bumble", 8, 8);

		return new RoundOfEight(team1, team2, team3, team4, team5, team6, team7, team8);
	}

	public static RoundOfEight secondBracket() {
		Team team1 = new Team("Nigeria",     3 ,3);
		Team team2 = new Team("Netherlands", 3, 2);
		Team team3 = new Team("Mexico",      3, 2);
		Team team4 = new Team("France",      4, 3);
		Team team5 = new Team("Japan",      7, 1);
		Team team6 = new Team("China",      2, 7);
		Team team7 = new Team("Austrailia",      7, 7);
		Team team8 = new Team("Iran",      7, 5);

		return new RoundOfEight(team1, team2, team3, team4, team5, team6, team7, team8);
	}

	public static void main(String[] args) {
		RoundOfSixteen round = new RoundOfSixteen(firstBracket(), secondBracket());
		Team winner = round.playTournament();
		
		System.out.println("Congratulations to " + winner);
	}
}
