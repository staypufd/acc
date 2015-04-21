import java.util.ArrayList;


public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		
		
		String a = new String("abc");
		String b = new String(new StringBuilder().append(true));
		
		ArrayList<String> al = new ArrayList();
		
		al.add("5");
		al.add("78");
		al.add("121.005");
		al.add("45332");
		
		int j = Integer.numberOfTrailingZeros(500);
		
		int i = 0;
		
		for (String s : al) {
			
			if (i < 1) 
				al.remove(2);
			else 
				i++;
			
			int theInt;
			try {
				theInt = Integer.parseInt(s);
				
				System.out.println(theInt + 5);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				
				System.out.println("Value " + s + " has data format issuse to be interrpretted as a Integer");
			}

			
		}
		

	}


}
