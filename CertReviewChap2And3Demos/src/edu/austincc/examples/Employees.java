package edu.austincc.examples;

public class Employees {

	public int dayOffWork(int... days) {
		
		int daysOff = 0;
		
		for (int i = 0; i < days.length; i++) {
			daysOff += days[i];
		}
		return daysOff;
	}
	
	
	public int numStrings(String...strings) {
		return strings.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees emps = new Employees();
		
		int theTotalDaysOff = emps.dayOffWork(4, 5, 1, 2, 5);
		
		System.out.println(theTotalDaysOff);
		
		System.out.println(emps.numStrings("abc", "def", "hij", "xyz"));

	}

}
