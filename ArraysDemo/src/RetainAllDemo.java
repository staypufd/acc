import java.util.ArrayList;


public class RetainAllDemo {

	public static void main(String[] args) {
		ArrayList<String> mal = new ArrayList<String>();
		
		mal.add("Sam G");
		mal.add("Bill H");
		mal.add("Sarah V");
		mal.add("Sindu MP");
		mal.add("Shabna S");
		mal.add("Sam G");
		mal.add("Marty F");
		mal.add("Sam K");
		mal.add("Bill C");
		
		System.out.println(mal.lastIndexOf("Sam G"));
		
		ArrayList<String> otherCollection = new ArrayList();
		otherCollection.add("Sam G");
		otherCollection.add("Bill C");
		
		
		boolean reatainedAny = mal.retainAll(otherCollection);

		if (reatainedAny == true) {
			for (String string : mal) {
				System.out.println(string);
			}
		}
		
		System.out.println(mal.lastIndexOf("Sam G"));
		
		

	}

}
