
public class Office {

	Office() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Office();
		
		Employee e = new HR();
		Employee e2 = new Employee();
		
		System.out.println(e);
		System.out.println(e2);
		
		e.name = "Sam";
		
		System.out.println(e);
		System.out.println(e2);
		
	}

	{
		
		System.out.println("First?");
		
	}
	
	static {
		System.out.println("Static Init");
	}
	
}
