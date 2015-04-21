import java.util.ArrayList;
import java.util.Scanner;


public class DoWhileDemo {

	public static void main(String[] args) {
		int a[] = {5, 6, 8, 9, 10};

		int i = 0;
		do {
			int theValue = a[i];
			System.out.println(theValue);
			
			i++;
		} while (i < 3);
		
		System.out.println("Done");
		
		System.out.println("Part 2");
		int x = 0;
		do {
			System.out.println("Blah");
			x++;
		} while (x < 4);
		
		
		System.out.println("Part 3");
		
		ArrayList<Integer> al = new ArrayList();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(10);
		
		do {
			Integer o = al.remove(al.size() - 1);
			if (o != null && (o instanceof Integer)) {
				int removeValue = o.intValue();
				System.out.println(removeValue);
			}
			
		} while (al.size() > 2);
		
		System.out.println(al);
		
		// Infinite Loop
		boolean quit = false;
		do {
			System.out.println("Hi");
			System.out.println(">> Type 'quit' to quit or <return> to continue");
			Scanner s = new Scanner(System.in);
			if (s.hasNext()) {
				String theString = s.next();
				
				if (theString.equalsIgnoreCase("quit")) {
					quit = true;
				}
				
				System.out.println("Hi");
			}
		} while (quit == true);
	}


	
}
