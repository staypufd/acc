/**
 * 
 */

/**
 * @author samjr
 *
 */
public class ExceptionHandlingExpandedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Stack myStack = new Stack();
			
			myStack.push("abc");
			myStack.push(7);
			myStack.push('c');
			myStack.push(2.45);
			
			System.out.println("Stack before pop");
			myStack.printStack();
			
			
			Object o = null;
		
			o = myStack.pop();

			System.out.println("Popped object O is: " + o +"\n");
			System.out.println("Stack after pop");
			myStack.printStack();
			
			// Now try to pop all the other elements off
			Object obj = myStack.pop();
			while (obj != null) {
				System.out.println("The popped value is: " + obj);
				obj = myStack.pop();
			}
		} catch (StackToBigException stbe) {
			System.out.println("The stacks gonna overflow so don't add the element");
		} catch (StackEmptyException see) {
			System.out.println("StackEmptyException:  The stack is empty do nothing.");
		} 
	}

}
