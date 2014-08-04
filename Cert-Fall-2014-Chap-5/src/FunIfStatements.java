
public class FunIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		badIfs();
//		betterIfs();
		notUsingSquirlyBrackets();

	}

	private static void badIfs() {
		String result = "1";
		int score = 90;
		if ((score = score + 10) == 100) 
			result = "A";
		else if ((score = score + 29) == 50)
			result = "B";
		else if ((score = score + 200) == 10)
			result = "C";
		else
			result = "F";
		System.out.println(result + ":" + score);
	}
	
	private static void betterIfs() {
		String result = "1";
		int score = 10;
		// Add 10 to score
		score = score + 10;
		if (score == 100) { 
			result = "A";
		} else {
			score = score + 29;
			if (score == 50) {
				result = "B";
			} else {
				score = score + 200;
				if (score == 10) {
					result = "C";
				} else {
					result = "F";
				}
			}
		}
		
		System.out.println(result + ":" + score);
	}
	
	
	public static void notUsingSquirlyBrackets() {
		String name = "Lion";
		int score = 100;
		if (name.equals("Lion")) {
			score = 200;
			name = "Larry";
		} else {
			score = 129;
		}
		
		int x = 10;
		String res = "Winner Winner Chicken Dinner!";
		if (x < 100) { 
			if (x < 85) {
				System.out.println("x less than 85");
				if (x < 70) {
					System.out.println("x less than 70");
				} 
			} 
		} else {
			System.out.println(res);
		}
		

		
		System.out.println(name);
		System.out.println(score);
	}
}
