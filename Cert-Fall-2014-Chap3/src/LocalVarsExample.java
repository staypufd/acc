
public class LocalVarsExample {
	
	// Class variables
	private static int myClassVar = 5;
	// Instance variables
	private int myIvar = 10;

	private static void speak() {
		
		// Local variable
		String appleADaySaying;
		
		appleADaySaying = "Eat an Apple a day to keep the doctor away!";
		
		System.out.println(appleADaySaying);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personName = "Sam";
		speak();
		
		System.out.println(personName);
	}

}
