package edu.austincc.examples;

public class MockExamQuestion4 {

	public static void main(String[] args) {
		int a = 10;
		String name = null;
		
		try {
			a = name.length();
			a++;
		} catch (RuntimeException e) {
			++a;
		} 
		
		System.out.println(a);

	}

}
