package edu.acc.domain;



public class PrettyPerson extends Person implements Howdy {
	
	public PrettyPerson() {
		// this.age = 12;
	}
	
	protected final float calcTaxes(int taxRate) {
		System.out.println("Calcing taxes in Person");
		return 8.2f;
	}
	
	public final void sayHello(String aGreeting) {
		System.out.println("This is the Pretty instance saying hello - " + aGreeting);
	}

}
