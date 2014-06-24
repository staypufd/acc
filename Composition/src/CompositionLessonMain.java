
public class CompositionLessonMain {

	public static void main(String[] args) {
		// Create a cookie
		Cookie myCookie = new Cookie("PeanutButter", 10);
		
		// Create two toppings
		Topping heartsTopping = new Topping("Hearts!", "Red");
		Topping diamondsTopping = new Topping("Diamonds", "Silver");
		
		myCookie.setTopping1(heartsTopping);
		myCookie.setTopping2(diamondsTopping);
		
		System.out.println(myCookie);
		
		
		// Create another Cookie
		Topping triangleTopping = new Topping("Triangle Topping", "Green");
		Topping roundTopping = new Topping("Round Topping", "Blue");
		Cookie myNewCookie = new Cookie("Red Velvet", 50, triangleTopping, roundTopping);
		
		System.out.println(myNewCookie);
		
	}

}
