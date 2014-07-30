package com.acc.chap3;

import domain.Person;


public class SwapPersons {

	public static void swap(Person person1, Person person2) {
		System.out.println("Inside swap method");
		System.out.println("Person1 is: " + person1.getName() + " Person2 is: " + person2.getName());
		
		System.out.println("Doing swap");
		Person temp = person1;
		person1 = person2;
		person2 = temp;
		
		
		System.out.println("Change the names");
		System.out.println(person1.getName());
		System.out.println("Change Paul to Jill");
		person1.setName("Jill");
		person1.setHeight(10);
		System.out.println("Change John to Sally");
		System.out.println(person2.getName());
		person2.setName("Sally");
		
		System.out.println("Inside swap:  " + person1.getName() + ":" + person2.getName());
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("John");
		Person person2 = new Person("Paul");
		

		System.out.println("Before swap");
		System.out.println(person1.getName() + ":" + person2.getName());
		System.out.println(person1.getHeight() + ":" + person2.getHeight());
		
		swap(person1, person2);
		
		// Swap the references 
//		Person temp = person1;
//		person1 = person2;
//		person2 = temp;
		
		System.out.println("Outside swap");
		System.out.println(person1.getName() + ":" + person2.getName());
		System.out.println(person1.getHeight() + ":" + person2.getHeight());

	}

}
