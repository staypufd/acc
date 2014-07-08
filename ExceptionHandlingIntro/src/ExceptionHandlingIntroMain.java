import java.util.ArrayList;

/**
 * Shows handling of Runtime type exceptions
 * 
 * Read more about Exceptions here:
 * http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
 */

/**
 * @author samjr
 *
 */
public class ExceptionHandlingIntroMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(10);
		float f = i.floatValue();
		ArrayList<String> a = null;
		String valueToBeAdded = "Sam";
		
		try {
			a = new ArrayList<>(1000000000);
			a.add("Bob");
			if (a != null) {
				a.add(10, valueToBeAdded);
			}
		} 
		catch (OutOfMemoryError oome) {
			System.out.println("We're out of memory!");
		}
		catch (IndexOutOfBoundsException  e) {
			System.out.println("Bummer! Couldn't add " + valueToBeAdded);
			//a.add(a.size(), valueToBeAdded);
		}
		catch (java.lang.RuntimeException rte) {
			System.out.println("Runtime Exception");
		}
		finally {
			System.out.println("Clean up");
			try {
				a.clear();
			}
			catch (NullPointerException npe) {
				System.out.println("Dang Nulls");
			}
		}
		
		System.out.println("a is: " + a);
	}

}
