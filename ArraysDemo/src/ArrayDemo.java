
public class ArrayDemo {

	public static void main(String[] args) {
		
		// int intArray[];
		int[] intArray;
		intArray = new int[10];
		
		int[] staticInitArray = {5, 8, 9, 10, 2, 88};
		
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 5;
		}

		intArray[0] = 10;
		intArray[1] = 1870;
		
		
		System.out.println(intArray);
		
		for (int i : staticInitArray) {
			System.out.println(i);
		}
		
	
	}

}
