class Person {
	public String name;
	public int height;
	
	void someMethod() {
		this.name = "someMethod";
		System.out.println(this.name);
	}

	Person anotherMethod() {

		Person p = new Person();
		p.name = "sam";
		System.out.println(p.name);
		return p;
	}
}

// what is the output of the following code?
class EJavaGuruPassObjects1 {
	public static void main(String args[]) {
		Person p = new Person();
		Person p2 = p.anotherMethod();
		
		
		p.name = "EJava";
		p.anotherMethod();
		System.out.println(p.name);
		p.someMethod();
		System.out.println(p.name);
		
		System.out.println(p2.name);
	}

}