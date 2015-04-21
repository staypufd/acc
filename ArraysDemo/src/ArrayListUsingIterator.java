import java.util.ArrayList;
import java.util.ListIterator;


public class ArrayListUsingIterator {

	public static void main(String[] args) {
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Four");
		myArrayList.add(2, "Three");

		
		ListIterator<String> iterator = myArrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " -- ");
			System.out.println(iterator.nextIndex());
			System.out.println(iterator.previousIndex());
		}

		ArrayList<Integer> myIntegerArrayList = new ArrayList();
		myIntegerArrayList.add(6);
		myIntegerArrayList.add(new Integer(6));
	}

}
