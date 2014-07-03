package javacup;

import java.util.Random;

public class Match implements Speakable {
	private Team team1;
	private Team team2;
	
    private Random random;

	public Match(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
		
        this.random = new Random();
	}

	
	private Team randomWinner() {
		Random random = new Random();
		if (random.nextBoolean()) {
			return team1;
		} else {
			return team2;
		}
	}
	
	public Team simulatedWinner() {
		int score1 = 0;
		int score2 = 0;
		
		for (int i=0; i<team1.getAttackPower(); i++) {
			if (random.nextInt(10) > team2.getDefensePower()) {
				score1++;
			}
		}
		
		for (int i=0; i<team2.getAttackPower(); i++) {
			if (random.nextInt(10) > team1.getDefensePower()) {
				score2++;
			}
		}
				
		Team winner = null;

		if (score1 > score2) {
			winner = team1;
		} else if (score2 > score1) {
			winner = team2;
		} else {
			winner = randomWinner();
		}
		
		System.out.println("Simulated result: " + score1 + " - " + score2 + 
				           " winner: " + winner);
		
		return winner;
	}
	
	public Team play() {
		System.out.println("Playing match between " + team1 + " and " + team2);
		return simulatedWinner();
	}

	@Override
	public String toString() {
		return "Match [team1=" + team1 + ", team2=" + team2 + "]";
	}


	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Match is speaking.";
	}

}
