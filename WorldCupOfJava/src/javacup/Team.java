package javacup;

public class Team {
	private String name;
	private int attackPower;
	private int defensePower;
	
	public Team(String name, int attackPower, int defensePower) {
		super();
		this.name = name;
		this.attackPower = attackPower;
		this.defensePower = defensePower;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + "]";
	}

	public int getAttackPower() {
		return this.attackPower;
	}

	public int getDefensePower() {
		return this.defensePower;
	}

	
}
