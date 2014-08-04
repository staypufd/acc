import java.util.ArrayList;

 class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
 
public class NestForLoopExample {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// forLoopingExample1();
		// forLoopingExample2();
		
		forLoopingExample3();

	}

	public static void forLoopingExample1() {
		int[][] twoDArray = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
				{ 9, 10, 11 }, { 12, 13, 14 } };

		for (int i = 0; i < twoDArray.length; i++) {
			System.out.println("Row: " + i);

			int[] aRow = twoDArray[i];

			for (int j = 0; j < aRow.length; j++) {
				System.out.println("Row item " + j + " is " + aRow[j]);
			}

		}
	}

	public static void forLoopingExample2() {
		double[][][] aMultiDimensionalArray = {
				{ 
					{ 1.0, 11.0, 22.0 }, 
					{ 55.0, 22.0, 44.8 } 
				},
				{ 
					{ 0.453 },
					{ 1.7, 89.34, 21.3 }, 
					{ 57.2, 1222.3, 994.7 } 
				},
				{ 
					{ 1.0, 11.0, 22.0, 55.0, 33.2, 55.22938 },
					{ 55.0, 9999.00, 888888.8, 100.22 }, 
					{ 56.0, 100.22 },
					{ 51.0, 21.0, 42.8, 100.22 }, 
					{ 52.0, 22.0, 100.22 }, 
				} 
		};

		for (int i = 0; i < aMultiDimensionalArray.length; i++) {
			double[][] aRow = aMultiDimensionalArray[i];
			System.out.println("1D: " + i);

			for (int j = 0; j < aRow.length; j++) {
				// System.out.println(aRow[j]);
				double[] aInnerRow = aRow[j];
				System.out.println("2D: " + j);

				for (int k = 0; k < aInnerRow.length; k++) {
					System.out.println("3D: " + aInnerRow[k]);
				}
			}
		}
		
		System.out.println("A spot in " + aMultiDimensionalArray[2][1][2]);
		double[][] aSecondDiminsion = aMultiDimensionalArray[1];
		System.out.println(aSecondDiminsion);
	}
	
	public static void forLoopingExample3() {
		
		ArrayList< ArrayList<? extends Object> > outer = new ArrayList<>();
		
		ArrayList<Float> floatsArrayList = new ArrayList<>();
		floatsArrayList.add(5.0f);
		floatsArrayList.add(44.55f);
		floatsArrayList.add(33.55f);
		outer.add(floatsArrayList);
		
		ArrayList<Integer> intsArrayList = new ArrayList<>();
		intsArrayList.add(4);
		intsArrayList.add(8);
		intsArrayList.add(4);
		intsArrayList.add(9);
		outer.add(intsArrayList);
		
		ArrayList<Long> arrayListOfLongs = new ArrayList<>();
		arrayListOfLongs.add(55L);
		arrayListOfLongs.add(888888L);
		arrayListOfLongs.add(9827498724L);
		outer.add(arrayListOfLongs);
		
		ArrayList<String> arrayListOfStrings = new ArrayList<>();
		arrayListOfStrings.add("Sam");
		arrayListOfStrings.add("did");
		arrayListOfStrings.add("this!");
		outer.add(arrayListOfStrings);
		
		ArrayList<Person> arrayListOfPerson = new ArrayList<>();
		arrayListOfPerson.add(new Person("Sam", 45));
		arrayListOfPerson.add(new Person("Jill", 22));
		arrayListOfPerson.add(new Person("Thomas Jefferson", 88));
		outer.add(arrayListOfPerson);
		
		// Loop over outer
		for (ArrayList al : outer) {
			for (Object object : al) {
				System.out.println(object);
				if (object instanceof Person) {
					Person p = (Person)object;
					System.out.println(p.getAge());
				}
			}
		}
		
		System.out.println("\nGetting a specific index in arrayLists of arralists");
		System.out.println(outer.get(2).get(2));
	}
}
