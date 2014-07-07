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
 * Collections Documentation on Oracle site is at: 
 * http://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html
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
		
		// Insert "Sally" with "Mary"
		al.add(3, "Mary");
		
		al.set(3, "Mary Replaced");
		
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
		
		
		int x = al.get(2);
		System.out.println("X is: " + x);

		System.out.println(al);
		System.out.println();
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
		
		hm.put("Sally", new Person("Sally", 40, 'f', "New York", "NY"));
		

		// Print the whole hashmap
		System.out.println(hm);
		
		// Print just the values of the hashmap
		System.out.println(hm.values());
		
		// Get the Integer for the key
		Integer o = (Integer) hm.get("Bob");
		// Print the Integer we got
		System.out.println(o);
		
		Object anO = hm.get("Bob");
		System.out.println(anO);
		
		String s = (String) hm.get("Sam");
		System.out.println(s);
		
		Object anO2	= hm.get("Sam");
		System.out.println(anO2);
		
		// Sally as a generic Object
		Object p = hm.get("Sally");
		System.out.println(p);
		
		// Sally has a person object so use a 'cast' to tell the 
		// compilier that we know we're pulling a Person out and not just a 
		// generic Object
		Person aPerson = (Person)hm.get("Sally");
		System.out.println("Sally lives in: " + aPerson.getCity());
		System.out.println(aPerson);
		
		// print out a blank line
		System.out.println();
		
	}
	
	public static void hashMapExampleTwo() {
		Map<String, Person> personMap = new HashMap<>();
		
		personMap.put("Sally", new Person("Sally", 45, 'f', "Houston", "TX"));
		personMap.put("Sam", new Person("Sam", 33, 'm', "Paris", "TX"));
		personMap.put("Greg", new Person("Greg", 21, 'M', "Austin", "TX"));
		
		System.out.println("Hashmap Example 2 Output");
		
		Person p = personMap.get("Greg");
		System.out.println("Our person is: " + p.getName() + " from city: " + p.getCity());
		
		System.out.println("---------");
		for (Person p2 : personMap.values()) {
			System.out.println(p2);
		}
		System.out.println("---------");
		
	}
	
	public static void hashMapExampleThree() {
		
		// Create a new HashMap that will hold a String as a key and a Object as a value
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Sam", 8);
		hm.put("Bob", 7); 
		hm.put("Jill", 3); 
		hm.put("Fran", 5); 
		hm.put("Spanky", 10); 
		hm.put("Mary", 19); 
		hm.put("Edwardo", 4); 
		hm.put("Q", 21); 
		hm.put("Steven", -9); 
		
		// Get keys set and print it
		System.out.println(hm.keySet());
		
		// Print out keys
		for (Iterator iterator = hm.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println(key);
		}
		
		// Another way to print out keys
		for (String key : hm.keySet()) {
			System.out.println(key);
		}
		
		// USE THIS WAY IN YOUR CODE
		// Sum the values
		int total = 0;
		for (int x : hm.values()) {
			// total = total + x;
			total += x;  // Shortcut syntax for above
		}
		System.out.println("The total of the values in the hashmap is: " + total);
		
		// This is how older code may do it.
		// Sum the values using the Integer object (autoboxing makes it so we don't 
		// have to write our code like this.  Use the above example...
		int total2 = 0;
		for (Integer x : hm.values()) {
			// total2 = total2 + x;
			total2 += x.intValue();  // Shortcut syntax for above
		}
		System.out.println("The total of the values in the hashmap is: " + total2);
		
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
		numbersSet.add(8);
		numbersSet.add(4);
		
		// TreeSet keeps objects added to it sorted
		System.out.print("Numbers in set are: " );
		for (Integer i : numbersSet) {
			System.out.print(i + " ");
		}
		
		// Print out two blank lines.  Note I'm using print not println.
		// If I would have use println then it would have given me one carriage return and the
		// string could have been "\n" which is one carriage return
		System.out.print("\n\n");

		System.out.println("Does set contain number 9? " + numbersSet.contains(9) + "\n");
		
		// Arrays is what is known as a Utility class
		// Arrays.asList will take a base type array and create a Collection from it.
		ArrayList<Integer> matchList = new ArrayList<Integer>(Arrays.asList(7, 8, 11));
		// Equivalent to this:
		// ArrayList<Integer> matchList = new ArrayList<Integer>();
		// matchList.add(7);
		// matchList.add(8);
		// matchList.add(11);
		
		System.out.println("Does set contain all of these numbers 7, 8 and 11? " + 
				numbersSet.containsAll(matchList) + "\n");
		
		// Empty the numbersSet
		System.out.println("Clearning numbersSet");
		numbersSet.clear();
		
		System.out.println("NumbersSet now has in it: " + numbersSet.toString());
	}
	
	public static void setExample2() {
		Set<String> stringsSet = new TreeSet<>();
		stringsSet.add("abc");
		stringsSet.add("acd");
		stringsSet.add("aaa");
		stringsSet.add("abc");
		stringsSet.add("Abc");
		
		System.out.println("Set Example 2 - Strings in a TreeSet");
		System.out.println("Strings should sort to natural order");
		System.out.println("----");
		for (String string : stringsSet) {
			System.out.println(string);
		}

		System.out.println("----");
		
	}
	
	public static void setExample3() {
		java.lang.Comparable comp;
		Set<Person> personSet = new TreeSet<>();
		personSet.add(new Person("Sally", 45, 'f', "Houston", "TX"));
		personSet.add(new Person("Sam", 33, 'm', "Paris", "TX"));
		personSet.add(new Person("Greg", 21, 'M', "Austin", "TX"));
		
		
		System.out.println("Set Example 3 - Persons in a TreeSet");
		System.out.println("Persons should sort to natural order");
		System.out.println("----");
		for (Person person : personSet) {
			System.out.println(person);
		}

		System.out.println("----");
		
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
		System.out.println("---");
		
		peopleSet.add(new Person("Omar", 76, 'm', "Reston", "VA"));
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
		hashMapExampleTwo();
		hashMapExampleThree();
		setExample();
		setExample2();
		setExample3();
		hashSetExample();
	}
	

}
