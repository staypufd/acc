
public class DontChangeObjectsInsideAForDemo {

	public static void main(String[] args) {
		String sString = "The woman went to the store!";
		String theNewString = null;
//		String theNewString = sString.replace('t', '$');
	
		
		for (int i = 0; i < sString.length(); i++) {
			char theChar = sString.charAt(i);
			
			theNewString = sString.replace(theChar, '#');
			
			System.out.println(theNewString);
		}
		
		System.out.println(sString);
		System.out.println(theNewString);
	}

}
