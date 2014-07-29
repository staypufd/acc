package edu.acc.domain;

 
import java.util.ArrayList;

import edu.acc.domain.giants.MyGiant;


/**
 * Block Comment
 */

interface BarInf {
	public int bazz();
	public int bazz(int aVal);
}

public class Person implements Howdy, FooInf, BarInf {

	// Class variables
	static ArrayList<Person> peopleHolder = new ArrayList<>();
	
	// Instance variables
	protected String name = "Bufford";
	final int age = 5;
	
	Person() { 
		peopleHolder.add(this);
	}
	
	Person(String aName) {
		peopleHolder.add(this);
		this.name = aName;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 19) {
			System.out.println("I don't ever wanna be older than 18");
			return;
		}
		// this.age = age;
	}

	protected final float calcTaxes() {
		System.out.println("Calcing taxes in Person");
		return 5.4f;
	}
	
	public final void sayHello() {
		System.out.println("This is the Person instance saying hello");
	}
	
	/**
	 * @param args
	 */
	static public  void main(String phone[]) {
		// TODO Auto-generated method stub
//		int age = 5;  // Person age set to five
//		
		System.out.println(phone[0] + " " + phone[1]);
		
		System.out.println("-----------");
		
		Person p = new Person();
		// p.age = 55;
		p.name = "Sam";

		Person p2 = new Person();
		// p2.age = 43;
		p2.name = "Norman";
		
		Person p3 = new Person();
		// p3.age = 11;
		p3.name = "Johnny";
		
		PrettyPerson pp = new PrettyPerson();
		pp.setAge(22); 
		pp.setName("Jill");
		
		Person p4 = new Person();
		
		Person p5 = new Person("Bobby");
		
		double eValue = Math.E;
		
		System.out.println("----------");
		for (Person aPerson : Person.peopleHolder) {
			System.out.println(aPerson.name + " " + aPerson.age);
			if (aPerson instanceof PrettyPerson) {
				((PrettyPerson) aPerson).sayHello("GutenTag");
			} else {
				aPerson.sayHello();
			}
			System.out.println(aPerson.bazz());
			System.out.println(aPerson.bazz(6));
			System.out.println(aPerson.foo());
		}
		
		MyGiant mg = new MyGiant("Jolly Green");
		System.out.println(mg.getName());
		mg.bazz();
		mg.foo();
		
	}

	@Override
	public int bazz() {

		return 100;
	}

	@Override
	public int bazz(int aVal) {
		// TODO Auto-generated method stub
		return aVal;
	}

	@Override
	public float foo() {
		// TODO Auto-generated method stub
		return 4.5f;
	}

}
