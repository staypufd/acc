package edu.austincc.examples;

public class EJava {

	public EJava() {
		this(7);
		System.out.println("public");
	}
	
	private EJava(int val) {
		this((short)1);
		System.out.println("private");
	}
	
	private EJava(short val) {
		this("Wednesday");
		System.out.println("private");
	}
	
	protected EJava(String val) {
		System.out.println("protected");
	}
}
