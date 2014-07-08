import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * @author samjr
 *
 */
public class CollectionFilterLabMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = new LinkedList<>();
		people.add(new Person("Sam", 46, 'm', "Austin", "TX"));
		people.add(new Person("Jill", 22, 'f', "Kyle", "TX"));
		people.add(new Person("Tom", 40, 'm', "Round Rock", "TX"));
		people.add(new Person("Buck", 28, 'm', "West Lake", "TX"));
		people.add(new Person("Emma", 19, 'f', "Bernie", "TX"));
		
		// Find people less than 40
		List<Person> peopleLessThanFourty = new ArrayList<>();
		for (Person person : people) {
			if (person.getAge() < 40) {
				
				// Make a copy of the person so that it can't change behind us
				peopleLessThanFourty.add(new Person(person.getName(), person.getAge(), person.getSex(), person.getCity(), person.getState()));
				// peopleLessThanFourty.add(person);
			}
		}
		
		// Modify the original object in position 1 of the people array
		// Will it make the peopleLessThanFourty list wrong now?  Not if 
		// we have copied the people before adding them to the peopleLessThanFourty list.
		people.get(1).setAge(44);
		
		// Print the list of peopleLessThanFourty
		System.out.println("**** People Less Than Fourty ****");
		for (Person person : peopleLessThanFourty) {
			System.out.println(person);
		}
		System.out.println("----");
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
