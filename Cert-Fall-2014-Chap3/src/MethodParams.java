import domain.Phone;

public class MethodParams {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		
		System.out.println("Is phone tested? " + myPhone.isTested());
		myPhone.setTested(true);
		System.out.println("Is phone tested? " + myPhone.isTested());

	}

}
