
public class ForIndexAssignmentDemo {

	public static void main(String[] args) {
		int i = 0;
		int j = 5;
		int a = j++;
		
		for(; i < 50 && j < 10; i = i + 5, ++a, ++j) {
			if (i < 5)
				continue;
			System.out.println("----- " + i);
			System.out.println("----- " + j);
			System.out.println("----- " + a);
		}
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
	}

}
