import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * 	Tutorial that shows more of Scanner
 * http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
 * 
 * Neat explination of Scanner here:
 * http://www.java-made-easy.com/java-scanner.html
 * 
 * 
 */

public class ScannerMain {
	
	private static Scanner s = null;
	
	/**
	 * Create a Main Menu
	 */
	private static void mainMenu() {
		System.out.println("Please type in a menu number choice:");
		System.out.println("1. hasNextExample - Shows reading of ints working fine, but if you put in float it has error.");
		System.out.println("2. hasNextIntExample - Shows reading of ints.");
		System.out.println("3. hasNextLineExampleUsingIfStatementsExample - Reading until one of two values is input then reading values exits. Uses if statements to check the exit values.");
		System.out.println("4. hasNextLineExampleUsingSwitchStatementExample - Reading until one of two values is input then reading values exits. Uses a switch statement to check the exit values.");
		System.out.println("5. hasNextLineExampleForFloatsExample - Shows reading of floats.");
		System.out.println("6. scannerStringParsingExample - Shows reading of any text values. One line at a time.");
		System.out.println("7. scannerStringParsingOfEmailAddressExample - Shows validating of a email address with Scanner match method and a RegEx.");
		System.out.println("8. Exit Main program.");
		System.out.println();

	}
	
	private static void hasNextLineExampleForFloatsExample() {
		
		System.out.println("Please enter a float. -1 to exit this program");

		while (s.hasNextFloat()) {
        		float theNextFloat = s.nextFloat();
        		System.out.println(theNextFloat);
        		if (theNextFloat == -1.0) {
        			break;
        		}
		} 
        System.out.println("No more floats, so exiting");
	}
	
	private static void hasNextLineExampleUsingIfStatementsExample() {
		// Tutorial that shows more of Scanner
		// http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
		
		// Double Quotes have to be escaped with a backslash character '\' so they
		// can appear inside a string.  Like so "Bob is an \"amazing\" camp leader!"
		System.out.println("Please enter any text. Enter \"abc\" or \"xyz\" to exit!");
		
		String theNextLine = null;
        
        // Read a line of text at a time
        while (s.hasNextLine()) {
        		theNextLine = s.nextLine();
        		
        		// Exit while loop and input reading if line is "abc" or "xyz"
        		if (theNextLine.equals("abc")) {
        			// Breaks out of the while loop
				break;
        		} else if (theNextLine.equals("xyz")) {
        			// Breaks out of the while loop
				break;
			}
    
        		System.out.println(theNextLine);
		} 
		
        System.out.println("Done with hasNextExample");
	}

	private static void hasNextLineExampleUsingSwitchStatementExample() {
		// Tutorial that shows more of Scanner
		// http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
		
		// This example is the same as above except instead of using 'if-then-else'
		// statements to check the input, it uses a switch statement and a boolean
		// variable to control when to exit the while loop.
		
		System.out.println("Please enter any text. Enter \"abc\" or \"xyz\" to exit!");

		String theNextLine = null;
		
		// Create a scanner on System.in InputStream
        s = new Scanner(System.in);
        
        // Exit while loop and input reading if line is "abc" or "xyz"
        while (s.hasNextLine()) {
        		theNextLine = s.nextLine();
        		
        		// Exit if line is "abc" or "xyz"
        		boolean exitWhileStatement = false;
        		switch (theNextLine) {
				case "abc":
					exitWhileStatement = true;
					// This break breaks out of the switch case for "abc"
					break;
				case "xyz":
					exitWhileStatement = true;
					// This break breaks out of the switch case for "xyz"
					break;
			}
        		
        		// Exit the while loop if exitWhile is true
        		if (exitWhileStatement == true) {
        			// This break exits out of the while loop above
        			break;
        		}
        		// Print out what we read
        		System.out.println(theNextLine);
		} 
		
        System.out.println("Done with hasNextLineExampleUsingSwitchStatementExample");
	}
	
	private static void hasNextIntExample() {
		// Tutorial that shows more of Scanner
		// http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
		
		System.out.println("Please type in integers. -1 to exit");
		
		while (s.hasNext()) {
				try {
	        		int theNextInt = s.nextInt();
	        		System.out.println(theNextInt);
	        		if (theNextInt == -1) {
	        			break;
	        		}
				} catch (InputMismatchException ime) {
                	s.nextLine();
        			System.out.println("Wrong type input. Please input an Integer.");
                }
		} 
		
        System.out.println("Done with hasNextExample");
	}
	
	private static void hasNextExample() {
		
		// This example shows how if you put in a float but try 
		// to get the nextInt() off the scanner, then you'll get
		// a InputMismatchException. This is due to you trying to read
		// an integer, but the value of the next token doesn't fit the read
		// pattern for a int, but would if you did a nextFloat()
		
		System.out.println("Please type in a integer, hit return, then put in a float.");
		System.out.println("You will see an error occure due to the float, b/c the code try's");
		System.out.println("to read a integer when the next token doesn't match the pattern of");
		System.out.println("a integer. Type -1 to exit.");
		
        while (s.hasNext()) {
        		try {
        			int theNextInt = s.nextInt();
            		System.out.println(theNextInt);
            		if (theNextInt == -1) {
            			break;
            		}
        		}
            catch (InputMismatchException ime) {
            	s.nextLine();
    			System.out.println("Wrong type input. Please input an Integer.");
            }
        }
        System.out.println("Done with hasNextExample");
	}
	
	public static void scannerStringParsingExample() {
		
		// Uses Regular Expression
		// See more about them here:
		// http://docs.oracle.com/javase/tutorial/essential/regex/
		
		System.out.println();
		System.out.println("Scan the string \"1 fish 2 fish red fish blue fish\" with");
		System.out.println("this RegEx: " + "(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
		
	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner fishScanner = new Scanner(input);
	     fishScanner.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
	     MatchResult result = fishScanner.match();
	     for (int i=1; i<=result.groupCount(); i++) {
	         System.out.println(result.group(i));
	     }

	     System.out.println();
	     fishScanner.close();

	}
	
	public static void scannerStringParsingOfEmailAddressExample() {

		// Article that shows an email RegEx
		// http://www.mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
		
		
		// Email RegEx pattern.  Note the string was too long for one line.
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + 
						"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		String emailString = "staypufd@mac.com";
		String badEmailString = "thisIsNotAValidEmail.com";
        Pattern p = Pattern.compile(EMAIL_PATTERN);

        // Valid email check
        // Validate that the pattern matches the email string
        Matcher matcher = p.matcher(emailString);
        if (matcher.matches()) {
    		System.out.println("The string " + emailString + " is a valid email address!");
	    } else {
	    		System.out.println("The string " + emailString + " is not a valid email address!");
	    }
        
        // Invalid email check
        // Validate that the pattern matches the email string
        matcher = p.matcher(badEmailString);
        if (matcher.matches()) {
        		System.out.println("The string " + badEmailString + " is a valid email address!");
        } else {
        		System.out.println("The string " + badEmailString + " is not a valid email address!");
        }
        System.out.println();
	}
		
	
	
	public static void main(String[] args) {
		// Tutorial that shows more of Scanner
		// http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
		

		boolean exitMenu = false;

		mainMenu();
		
        s = new Scanner(System.in);
        while (exitMenu != true) {
    		while (s.hasNext()) {
	    		int menuNumChoice = s.nextInt();
	    		// Dispatch on choice
	    		switch (menuNumChoice) {
					case 1:
						hasNextExample();
						break;
					case 2:
						hasNextIntExample();
						break;
					case 3:
						hasNextLineExampleUsingIfStatementsExample();
						break;
					case 4:
						hasNextLineExampleUsingSwitchStatementExample();
						break;
					case 5:
						hasNextLineExampleForFloatsExample();
						break;	
					case 6:
						scannerStringParsingExample();
						break;
					case 7:
						scannerStringParsingOfEmailAddressExample();
						break;
					case 8:
						exitMenu = true;
						break;
					default:
						System.out.println();
						System.out.println("No option for that choice. Please try again!");
						System.out.println();
				}
	    		if (exitMenu == true) {
	    			// Break out of while loop
	    			break;
	    		} else {
	    			mainMenu();
	    		}
    		}
		} 
		
        s.close();
        System.out.println("Exiting Program. Come back again soon!");
		
	}



}
