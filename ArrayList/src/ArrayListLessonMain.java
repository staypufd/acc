import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author samjr
 *
 */
public class ArrayListLessonMain {
	public static void main(String[] args) {
		// Create a cookie
		Cookie myCookie = new Cookie("PeanutButter", 10);
		
		// Create some topings
		Topping heartsTopping = new Topping("Hearts!", "Red");
		Topping diamondsTopping = new Topping("Diamonds", "Silver");
		Topping bobsBunkerBuster = new Topping("Giant Pretzels", "Auburn");
		
		// Fill a toppings arrayList with the new toppings
		ArrayList<Topping> theToppings = new ArrayList<>();
		theToppings.add(heartsTopping);
		theToppings.add(diamondsTopping);
		theToppings.add(bobsBunkerBuster);
		
		// Add the toppings to the cookie
		myCookie.setToppings(theToppings);
		
		System.out.println(myCookie);
		
		// Create another Cookie
		ArrayList<Topping> theToppings2 = new ArrayList<>();
		Topping triangleTopping = new Topping("Triangle Topping", "Green");
		Topping roundTopping = new Topping("Round Topping", "Blue");
		theToppings2.add(triangleTopping);
		theToppings2.add(roundTopping);
		Cookie myNewCookie = new Cookie("Red Velvet", 50, theToppings2);
		
		System.out.println(myNewCookie);
		
		// Print the second list of toppings using for each for Collections or arrays
		for (Topping topping : theToppings2) {
			System.out.println(topping);
		}
		
		// Print the second list of toppings using the for for Collections
		for (Iterator iterator = theToppings2.iterator(); iterator.hasNext();) {
			Topping topping = (Topping) iterator.next();
			System.out.println(topping);
		}
		
		// Create a statically initialized array object of Strings
		String a[] = {"sam", "bob", "jill", "kathy", "Viv", "Lakshmi", "Frank", "Jerry"};
		// loop over it and print the strings
		for (String theString : a) {
			System.out.println(theString);
		}
		
		// Print the array a using index based for, but only print out
		// items in the array less than 5	
		for (int i = 0; i < a.length; i++) {
			if (i  <= 5) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		
		// Copy an array of string into an arrayList
		ArrayList<String> arrayListLikeA = new ArrayList<>();
		for (String string : a) {
			// Get a copy of the string so that the ArrayList has it's
			// own strings and doesn't share them with the array.
			String stringCopy = new String(string);
			arrayListLikeA.add(stringCopy);
		}
		
		// Check for a object at an index in an arrayList
		for (String string : arrayListLikeA) {
			int theStringIndex = arrayListLikeA.indexOf(string);
			if (theStringIndex <= 4) {
				System.out.println(string);
			}
		}
		
		System.out.println("---------");
		
		ArrayList<String> anotherCopyOfTheArray = BaseTypeArrayHelper.copyArrayToArrayList(a);
		for (String string : anotherCopyOfTheArray) {
			System.out.println(string);
		}
		
		System.out.println("---------");
		
		
	}
	
	
}
