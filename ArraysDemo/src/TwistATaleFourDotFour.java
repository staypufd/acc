import java.util.ArrayList;


public class TwistATaleFourDotFour {

	public int foo(String a) throws Exception 
	{
		return 5;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> myArrList = new ArrayList<String>();
		
		String one = "One";
		String two =  new String("Two");
		
		myArrList.add(one);
		myArrList.add(two);
		
		ArrayList<String> yourArrayList = myArrList;
		
		new String("abd");
	
		one.replace("O", "B");
		
		"mesquite in your cellar".replace('e', 'o');
		String b = "abcd".concat(" - Howdy!").concat(" oh");
		String c = "abcd" + " - Howdy!" + " oh ";
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println( "mesquite in your cellar".replace('e', 'o') );

		
		for (String val : myArrList) {
			System.out.print(val + ":");
		}
		
		for (String val : yourArrayList) {
			System.out.print(val + ":");
		}

	}

}
