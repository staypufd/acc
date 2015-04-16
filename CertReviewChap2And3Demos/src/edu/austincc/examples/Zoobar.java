package edu.austincc.examples;

import java.util.ArrayList;


public class Zoobar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulateDemo ed = new EncapsulateDemo();

		ArrayList<Person> myALP = ed.alp;
		myALP.add(new Person(300));
		System.out.println(myALP.size());
	}

}
