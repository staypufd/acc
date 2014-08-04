
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "monday";
		switch (day) {
		case "MONDAY":  System.out.println("MONDAY upper case");
		case "monday":  System.out.println("monday lower case");
		case "TUESDAY":	System.out.println("Hockey Game");
		case "WEDNESDAY":
		case "wednesday":
		case "THURSDAY": System.out.println("Time to work");
						 break;
		case "FRIDAY": System.out.println("TGIF");
						break;
		case "SATURDAY": 
		case "SUNDAY": System.out.println("Weekend Yay!");
					   break;

		default: System.out.println("Default");
		}
		System.out.println("nothing");
	}

}
