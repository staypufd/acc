package domain;

public class Phone {
	// Class variables
	private static int foo = 10;
	private static int digits[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	
	// Instance variables
	private boolean tested;
	
	// Constructors 
	public Phone() {
		tested = false;
	}
	
	// Getters & Setters
	public void setTested(Boolean val) {
		tested = val;
	}
	
	public boolean isTested() {
		return tested;
	}
	
	// Behaviors
	public void dial() {
		System.out.println("Beep, Beep, Beep!");
	}
}