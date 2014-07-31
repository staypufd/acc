import com.acc.cert.chap4.AnotherClass;


/*
 * Block Comment
 */

// Line Comment

public class StringPlayground {

	public static void main(String[] args) {
		
		// AnotherClass.getNickName();
		
		int[] arr = new int[10];
		byte b = 4; char c = 'c'; long longVar = 10;
		char SeventyFivePercentFilledCircle = '\u25D5';
		
		arr[0] = b;
		arr[1] = c;

		arr[3] = (int)longVar;
		
		// A int array can hold characters b/c it treats them as ints
		arr[8] = SeventyFivePercentFilledCircle;
		
		// Make a character array to hold characters
		char[] ca = new char[4];
		ca[1]= SeventyFivePercentFilledCircle;
		
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);

		// Print out the char
		System.out.println(ca[1]);
		// Print out the char as a int
		System.out.println((int)ca[1]);
		
		
		
		
	}

}
