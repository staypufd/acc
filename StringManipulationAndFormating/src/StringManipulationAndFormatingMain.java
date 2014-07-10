/**
 * 
 */

/**
 * @author samjr
 *
 */
public class StringManipulationAndFormatingMain {

	private static void twoLineSeperator() {
		System.out.println("\n\n");
	}
	
	private static void importantStringOperationsExample() {
		String testString = "\n\nThis is a test test string #Tttthe and a number 6. abcq  \n\t";
		
		String trimmedString = testString.trim();
		
		String[] stringParts = trimmedString.split("[Th]+he and");
		// String[] stringParts = trimmedString.split("[ab]c");
		
		for (String part : stringParts) {
			System.out.println(part);
		}
		
		twoLineSeperator();
		String mySubString = trimmedString.substring(4, 8);
		System.out.println(mySubString.trim());
		
	}
	
	private static void stringFormattingExample1() {
		System.out.println("\n\n-------\n\n");
		System.out.printf("Integer : %d\n",15);
		System.out.printf("Floating point number with 3 decimal digits: %.3f\n", 5.6468828279);
		System.out.printf("Floating point number with 8 decimal digits: %.8f\n", 1.54922792827228298393938737320917123234173);
		System.out.printf("String: %s, integer: %d, float: %.6f", "Hello World", 79, 11.7341435);
		
		twoLineSeperator();
		System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
		System.out.printf("%+-12d%-12d%07d\n",-15,12,5);

		twoLineSeperator();
		System.out.printf("%-12s%-12s\n","Column 1","Column 2");
		System.out.printf("%-12.5f%.20f", 12.23429837482,9.10212023134);
		
		twoLineSeperator();
		String s = String.format("%-12.5f%.20f", 12.23429837482,9.10212023134);
		System.out.println(s);
		
		twoLineSeperator();

	}
	
	private static void stringBuilderExample() {
		String palindrome = "Dot saw I was Tod";
        
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();  // reverse it
        
        System.out.println(sb);
        
        sb.append('a').append("foobar").insert(sb.length(), "This starts at ");
        sb.append(sb.length());
        System.out.println(sb);
        sb.append(' ');
        String str = String.format("%+-12d", 55);
        sb.append(str);
        sb.append(98.6699);
        System.out.println(sb);
;	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		importantStringOperationsExample();
		stringFormattingExample1();
		stringBuilderExample();
	}

}
