
public class BaseTypesAndThereClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float myFloat = 20.54f;
		byte myBaseByte = 023;
		byte myBaseByte2 = 0x23;
		String myString = "1,134,,355.04,45";
		System.out.println(myString.charAt(5));
		// myString = myString.replace(",", "");
		myString = myString.replaceAll("[,.]", "");
		System.out.println(myString);
		System.out.println(myString.charAt(5));
		
		int i = new Integer("125000");
		boolean b = new Boolean(false);
		float f = new Float(5.4);
		byte myByte = new Byte("127");
		short myShort = new Short((short)34445);
		long myLong = new Long(1000344887888888845L);
		System.out.println(myBaseByte);;
		
		// Does a double underscore matter?
		long base10Long = 10_056_623_468L;
		System.out.println(base10Long);
		
		// Character's use ASCII characters codes
		// http://www.asciitable.com
		char myZ = 122;
		char myD = 100;
		System.out.println(myZ);
		System.out.println(myD);
		
		// These are Unicode character codes
		// http://unicode-table.com/en/
		System.out.println("\u0122");
		System.out.println("\u0222");
		System.out.println("\u0822");
		System.out.println("\u2122");
		System.out.println("\u2363");
		
		int £abc = 120;
		System.out.println(£abc);
		
		int abcqer = 10;
		System.out.println();
		
		final int x = 188;

	}
	

}
