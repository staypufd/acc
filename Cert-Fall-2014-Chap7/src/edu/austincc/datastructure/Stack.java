package edu.austincc.datastructure;
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
	
	public Stack() {
		// Do nothing the ivars are already inited
	}
	
	public Stack(int desiredStackSize) {
		setMaxStackSize(desiredStackSize);
	}
	
	public int getMaxStackSize() {
		return maxStackSize;
	}

	protected void setMaxStackSize(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}
	
	public int getCurrentStackSize() { 
		return s.size();
	}

	public void push(Object o) throws StackToBigException   {
		if (s.size() < maxStackSize) {
			s.add(0, o);
		} else {
			String s = "The stack size to big it's: " + this.getCurrentStackSize();
			throw new StackToBigException(s);
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
	
	
	public String printStack() {
		StringBuilder sb = new StringBuilder();
		sb.append("The stack looks like: \n");
		// Now put the objects on the stack onto the StringBuilder instance
		for (Object o : s) {
			sb.append(o);
			sb.append(", \n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack [maxStackSize=").append(maxStackSize)
				.append(", s=").append(s).append("]");
		return builder.toString();
	}
	
	
}
