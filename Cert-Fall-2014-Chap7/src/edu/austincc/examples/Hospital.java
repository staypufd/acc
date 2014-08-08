package edu.austincc.examples;

class Doctor {
	protected int age;
	protected void setAge(int val) { age = val; };
	protected int getAge() { return age; };
}

 class Surgeon extends Doctor {
	public Surgeon(String val) {
		specialization = val;
	}
	String specialization;
	String getSpecialization() { return specialization; }
}

 class Hospital {
	public static void main(String args[]) {
		Surgeon s1 = new Surgeon("Liver");
		Surgeon s2 = new Surgeon("Heart");
		
		s1.age = 45;
		
		System.out.println(s1.age + s2.getSpecialization());
		System.out.println(s2.age + s1.getSpecialization());
	}
}
