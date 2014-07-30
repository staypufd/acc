import domain.Person;


public class EJavaGuruPassObjects1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("EJava");
		
		anotherMethod(p);
		System.out.println(p.getName());
		
		someMethod(p);
		System.out.println(p.getName());
	}

	
	
	private static void someMethod(Person p) {
		p.setName("someMethod");
		System.out.println(p.getName());
	}



	private static void anotherMethod(Person p) {
		p = new Person();
		p.setName("anotherMethod");
		System.out.println(p.getName());
	}
	
}
