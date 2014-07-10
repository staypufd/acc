import java.util.ArrayList;

/**
 * 
 */

/**
 * @author samjr
 *
 */
public class Stack {
	private int maxStackSize = 3; // Really 4 since Collections are base zero
	private ArrayList<Object> s = new ArrayList<>();
	
	public void push(Object o) throws StackToBigException {
		if (s.size() < maxStackSize) {
			s.add(0, o);
		} else {
			throw new StackToBigException();
		}
	}
	
	public Object pop() throws StackEmptyException {
		if (s.size() == 0) {
			throw new StackEmptyException();
		} else {
			return s.remove(0);
		}
	}
	
	public int size() {
		return s.size();
	}
	
	public void printStack() {
		System.out.println("The stack looks like: ");
		for (Object o : s) {
			System.out.println(o);
		}
		System.out.println();
	}
}
