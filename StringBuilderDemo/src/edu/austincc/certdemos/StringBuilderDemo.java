package edu.austincc.certdemos;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
		System.out.println(sb);
		
		
//		StringBuilder leftOver = sb.delete(3, 6);
//		
//		System.out.println("--");
//		System.out.println(leftOver.toString());
//		System.out.println(sb.toString());
//		System.out.println("--");
//		
//		sb.append(leftOver);
		
		final char findThisChar = '4';
		int endIndex = sb.toString().indexOf(findThisChar);
		// sb.append(sb.delete(3, endIndex));
		sb.insert(endIndex, 6);
		
		System.out.println(sb.reverse());
		
	
		System.out.println(sb);
		
		System.out.println(5 + 9 * 9 / 2);


	}

}
