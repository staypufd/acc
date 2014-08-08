package edu.austincc.examples;

public class MockExamQuestion3 {

	public static void main(String[] args) {
		try {
			String [][] names = {{"Andrea", "Mike"}, {"Bob"}, {"Pedro", "J"}};
			
			String[] firstArray = names[2];
			if (firstArray != null) {
				String aNameString = firstArray[1];
				if (aNameString != null) {
					String result = aNameString.substring(0, 2);
					System.out.println(result);
					
				}
			}
			
		} catch (Throwable e) {
			System.out.println("Exception caught");
		}

	}

}
