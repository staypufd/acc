package edu.austincc.examples;

import java.util.ArrayList;


public class EncapsulateDemo {

	ArrayList<Person> alp = new ArrayList<>();
	
	Person p = new Person(11);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulateDemo ed = new EncapsulateDemo();
		
		System.out.println(ed.p.size());
		System.out.println(ed.p.getSize());
		
	}

}
