/**
 * 
 */

/**
 * @author samjr
 *
 */
public class TestPrintln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  The println method is Overloaded
		 *  
		 *  Overloaded means it has implementations for different argument types
		 */
		
		// Local variable we use in one of the examples
		char myCharArray[] = {'g', 'o', 'o', 'd'};
		
		/*
		 *  The method println has Overloaded implementations that handle types:
		 *  	no argument, character, string, int, float, long, 
		 *  double, boolean, char[] 
		 *  
		 *  In Eclipse, press Ctrl (Windows) or Cmd (Mac) key and then
		 *  hover over the word println below.  A menu will pop up with
		 *  Open Declaration and Open Implementation in it. Choose Open
		 *  Declaration and you'll go to the class (PrintStream) that has
		 *  the prinln methods and you can see it overloaded for all the
		 *  types listed above.
		 *  
		 *  If you get an error 'Source not found' you should see a
		 *  button 'Attach Source...'
		 *  Follow the instructions as mentioned in this link:
		 *  		http://veerasundar.com/blog/2011/08/attaching-java-source-with-eclipse-ide/
		 *  For a Mac the JDK is installed in a different location so read this:
		 *  		http://stackoverflow.com/questions/4011002/java-eclipse-on-macosx-where-is-the-src-zip
		 *  
		 *  If you still have errors get your instructor to help you fix them.
		 */
		System.out.println(); // prints a newline
		System.out.println('a');
		System.out.println("abc was here");
		System.out.println(1);
		System.out.println(1.0f);
		System.out.println(1L);
		System.out.println(1.0d);
		System.out.println(true);
		System.out.println(myCharArray);
		
		
		/*
		 *  Additional examples that use println for other types
		 */
		
		// This uses the int version b/c 0x8F is just a radix encoded bytes
		// See this link for more info on radix based numbers
		// http://docs.oracle.com/javase/tutorial/java/data/numberclasses.html
		System.out.println(0x8F); 
		
		// 
		System.out.println((short)1);
	}

}
