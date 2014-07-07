import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



/**
 * 
 */

/**
 * @author samjr
 *
 */
public class CollectionsDemos {

	// You can add any object type to the List below
	public static void listExample() {
		List<Object> al = new LinkedList<>();
		al.add(new Object());
		al.add("abc");
		// Add the string "bob" at position 2
		al.add(2, "bob");
		al.add(3, "Sally");
		al.add(al.size(), "Jill");
		// If you try to add to a position larger than the size of the array you will get an error (java.lang.IndexOutOfBoundsException)
		// al.add(10, "Frank");
		
		
		
		System.out.println(al);
	}
	
	public static void listExampleTwo() {
		List<Integer> al = new ArrayList<>();
		al.add(-8);
		al.add(7);
		al.add(2);
		al.add(8);
		al.add(18);
		al.add(8);
		al.add(3);

		System.out.println(al);
	}
	
	/**
	 * HashMaps are like a dictionary.  They have a key and a value.  
	 * The HashMap example shows how you can store objects and base types (which get Autoboxed into objects.
	 */
	public static void hashMapExample() {
		
		// Create a new HashMap that will hold a String as a key and a Object as a value
		Map<String, Object> hm = new HashMap<>();
		hm.put("Sam", "Sam Value");
		// Readme more about Autoboxing here:  http://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
		hm.put("Bob", 7);  // This automatically Autoboxes the integer 7
		
		// Older Java Development Kits before JDK 5 required you to create a instance of 
		// the Integer class initialized with the int 7. Integer class is a Object subclass not a base type
		// hm.put("Bob", new Integer(7));

		// Print the whole hashmap
		System.out.println(hm);
		
		// Print just the values of the hashmap
		System.out.println(hm.values());
		
		// Get the Integer for the key
		Integer o = (Integer) hm.get("Bob");
		// Print the Integer we got
		System.out.println(o);
		
		// print out a blank line
		System.out.println();
		
	}
	
	public static void setExample() {
		Set<Integer> numbersSet = new TreeSet<>();
		numbersSet.add(5);
		numbersSet.add(4);
		numbersSet.add(8);
		numbersSet.add(9);
		numbersSet.add(7);
		numbersSet.add(11);
		numbersSet.add(1);
		
		// TreeSet keeps objects added to it sorted
		System.out.print("Numbers in set are: " );
		for (Integer integer : numbersSet) {
			System.out.print(integer + " ");
		}
		
		// Print out two blank lines.  Note I'm using print not println.
		// If I would have use println then it would have given me one carriage return and the
		// string could have been "\n" which is one carriage return
		System.out.print("\n\n");

		System.out.println("Does set contain number 9? " + numbersSet.contains(9) + "\n");
		
		ArrayList<Integer> matchList = new ArrayList<Integer>(Arrays.asList(7, 8, 11));
		System.out.println("Does set contain all of these numbers 7, 8 and 11? " + 
				numbersSet.containsAll(matchList) + "\n");
		
		// Empty the numbersSet
		System.out.println("Clearning numbersSet");
		numbersSet.clear();
		
		System.out.println("NumbersSet now has in it: " + numbersSet.toString());
	}
	
	public static void hashSetExample() {
		
		// HashSet doesn't sort the objects added to it
		Set<Person> peopleSet = new HashSet<>();
		peopleSet.add(new Person("Sam", 46, 'M', "Austin", "TX"));
		peopleSet.add(new Person("Bob", 23, 'M', "Dallas", "TX"));
		peopleSet.add(new Person("Jill", 23, 'F', "Denver", "CO"));
		peopleSet.add(new Person("Sally", 7, 'f', "Austin", "TX"));
		peopleSet.add(new Person("Vinkat", 57, 'm', "Chicago", "IL"));
		
		System.out.println();
		System.out.println("People are: " + peopleSet);
		for (Person person : peopleSet) {
			System.out.println("Peoples names are: " + person.getName());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listExample();
		listExampleTwo();
		hashMapExample();
		setExample();
		hashSetExample();
	}
	

}
