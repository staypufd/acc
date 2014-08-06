package edu.austincc.main;

import java.util.Random;

import edu.austincc.datastructure.Stack;
import edu.austincc.datastructure.StackEmptyException;
import edu.austincc.datastructure.StackToBigException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(100);
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			try {
				myStack.push(r.nextInt());
			} catch (StackToBigException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Print the stack
		System.out.println(myStack);
		System.out.println("----");
		System.out.println(myStack.printStack());
		
		try {
			System.out.println("In the try");
			myStack.push(100);
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.getCurrentStackSize();
			myStack.pop();
			
			myStack.getCurrentStackSize();
		
		} catch (StackToBigException | StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally running");
		}
		
	}

}
