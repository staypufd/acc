package edu.austincc.examples;

public class Course {
	void enroll(long duration) {
		System.out.println("long");
	}
	
	void enroll(int duration) {
		System.out.println("int");
	}
	
	void enroll(String s) {
		System.out.println("String");
	}
	
	void enroll(Object o) {
		System.out.println("Object");
	}
}
