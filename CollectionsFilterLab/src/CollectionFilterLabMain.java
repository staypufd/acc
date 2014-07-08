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
				peopleLessThanFourty.add(new Person(person.getName(), person.getAge(), person.getSex(), person.getCity(), person.getState()));
			}
		}
		
		// Print the list of peopleLessThanFourty
		System.out.println("**** People Less Than Fourty ****");
		for (Person person : peopleLessThanFourty) {
			System.out.println(person);
		}
	}

}
