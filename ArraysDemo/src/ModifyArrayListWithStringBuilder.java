import java.util.ArrayList;
import java.util.ListIterator;


public class ModifyArrayListWithStringBuilder {

	public static void main(String[] args) {
		
		ArrayList<StringBuilder> myArrayList = new ArrayList();
		
		myArrayList.add(new StringBuilder("One"));
		myArrayList.add(new StringBuilder("Two"));
		myArrayList.add(new StringBuilder("Three"));

		for (StringBuilder element : myArrayList) {
			element.append(" - ");
			element.append(element.length());
			System.out.println(element);
		}

		
	}

}
