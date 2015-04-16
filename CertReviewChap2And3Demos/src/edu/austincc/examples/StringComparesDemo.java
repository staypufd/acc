package edu.austincc.examples;

import java.awt.Button;

public class StringComparesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("John" == "John");
		
		System.out.println("John".equals("John"));
		
		System.out.println("John".equals(new Button("John")));
		
		String a = "John";
		String b = "John";
		
		String c = new String(b);
		
		System.out.println(a == b);
		
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		
		
		Button b1 = new Button("John");
		Button b2 = new Button("Save");
		
		Button theButton = b1;
		
		if (theButton == b2) {
			System.out.println("About to save...");
		}
		
		if (theButton == b1) {
			System.out.println("Ahhhh");
		}
		
		
		
		String s1 = "Sally";
		String s2 = "Bob";
		
		String thePersonString = "Sal";
		
		
		if (thePersonString == s1.substring(0, 2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		String hw = "Hello world!";
		
		System.out.println(hw);
		
		
		
		String letters = "ABCAB";
		System.out.println(letters.substring(0, 2).startsWith("A"));
		
		
		String abc = "abc";
		
		String qrs = "qrs";
		
		String r = abc + qrs;
		
		r = r + 'A';
		
		System.out.println(r);
	}

}
