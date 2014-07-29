import java.util.ArrayList;


public class ObjectReferenceExample {

	public static void main(String[] args) {
		ArrayList<Object> ar, as, at;
		// ar = null;
		ar = new ArrayList<>();
		as = new ArrayList<>();
		as.add(new Integer(5));
		at = as;
		
		System.out.println(at);
		System.out.println(as);
		
		
		
		System.out.println(ar.size());
		

	}

}
