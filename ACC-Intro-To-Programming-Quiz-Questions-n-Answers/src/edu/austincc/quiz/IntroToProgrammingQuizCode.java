package edu.austincc.quiz;

public class IntroToProgrammingQuizCode {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
		question2();
		question3();
		question4();
	}

	
	private static void question1() {
		int x;
		int y;
		
		x = 5;
		y = x + 10;
		
		System.out.println("Y is: " + y + " and X is: " + x);
		
	}
	
	private static void question2() {
		
		boolean isAlive;
		
		isAlive = false;
		
		if (isAlive) {
			System.out.println("The alien is alive!");
		} else {
			System.out.println("The alien is dead Jim!");
		}
		
	}
	
	private static void question3() {
		
		float x = 5.0f;
		
		if ( x == 5f ) {
			System.out.println("They are equal! " + x + " is a wonderful number!");
		} else {
			System.out.println("They are not equal " + x + " is not a winner!");
		}
		
	}
	
	private static void question4() {
		
		String outputString;
		
		outputString = String.format("Hello, %s! We're sure your gonna be a great coder!", "Sally, Smith");
		
		System.out.println(outputString);
		
	}
	
	
	
}
