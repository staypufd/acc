package edu.austincc.examples.anotherPackage;

import  edu.austincc.examples.EncapsulateDemo;
import edu.austincc.examples.Person;

public class EncapSub extends EncapsulateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapSub es = new EncapSub();
		
		es.alp.add(new Person(100));
		
		System.out.println(es.alp);
		
	}

}
