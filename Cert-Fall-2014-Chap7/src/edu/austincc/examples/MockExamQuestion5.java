package edu.austincc.examples;

public class MockExamQuestion5 {

	
	public static void main(String[] args) {
		Student s = new Student();
		switch (s.marks) {
			default: System.out.println("100");
			case 10: System.out.println("10");
			case 98: System.out.println("98");
		}
	}

}
