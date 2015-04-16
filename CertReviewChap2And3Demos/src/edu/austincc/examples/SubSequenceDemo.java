package edu.austincc.examples;

public class SubSequenceDemo {

	public static void main(String[] args) {

		String theResult = (String) "The man is cool!".subSequence(4, 8);
		System.out.println(theResult);

		int intArray[] = new int[] { 4, 8, 107 };

		int abc[] = new int[5];
		abc[0] = 5;
		abc[1] = 10;
		abc[3] = 20;

		// for loop version that gets each value from abc and puts it in
		// variable i
		for (int i : abc) {
			System.out.println(i);
		}

		// for loop version that gets the length of the array abc and then for
		// each index
		// gets the value at that index and puts it into local variable j
		for (int i = 0; i < abc.length; i++) {
			int j = abc[i];
			System.out.println(j);
		}

		String strArray[] = new String[] { "abc", "def", "xyz" };
		for (String s : strArray) {
			System.out.println(s.toUpperCase().concat(" -- Sam is Rad!"));
		}

		System.out.println("---");

		int TwoDArray[][] = new int[][] { 
				{ 4, 5, 6, 5 }, { 10, 12, 88, 5 },
				{ 1, 4, 9, 5 }, { 5, 22, 89, 5 }, { 78, 102, 27, 5 },
				{ 8, 9, 11, 72, 188 } 
				};

		int TwoDArray2[][] = new int[2][3];
		TwoDArray2[0][0] = 0;
		TwoDArray2[0][1] = 1;
		TwoDArray2[0][2] = 2;

		TwoDArray2[1][0] = 3;
		TwoDArray2[1][1] = 4;
		TwoDArray2[1][2] = 5;

		for (int[] is : TwoDArray2) {
			System.out.println(is);
			for (int i : is) {
				System.out.println(i);
			}
		}
		
		System.out.println("############################################\n\n\n\n");
		int[][][] threeDA = new int[][][] 
				{
					{ { 2 }, {4, 5}, {5, 8, 9, 19}  },
					{ {99, 77, 88}, {4}, {5, 8}  },
					{ {100, 78, 10003, 567}, {4, 5, 7, 9}, {5, 23, 24, 25, 1, 2, 3, 4, 5}, {55, 66},  
				},
		};
		
//		for (int[][] is : threeDA) {
//			System.out.println("---");
//			for (int[] is2 : is) {
//				System.out.println("***");
//				for (int i : is2) {
//					System.out.println(i);
//				}
//			}
//		}
		
		//threeDA[2][1][8] = 101;
		
		for (int i = 0; i < threeDA.length; i++) {
				//System.out.println("Dim 1 length is: " + threeDA[i].length);
				for (int j = 0; j < threeDA[i].length; j++) {
					//System.out.println("\tDim 2 length is: " + threeDA[i][j].length);
					for (int j2 = 0; j2 < threeDA[i][j].length; j2++) {
						//System.out.println("\t\tvalue is: " + threeDA[i][j][j2]);
						System.out.println("[" + i + "][" + j + "][" + j2 + "] = " + threeDA[i][j][j2]);
					}
				}
				System.out.println("-----\n");
		}

	}
}
