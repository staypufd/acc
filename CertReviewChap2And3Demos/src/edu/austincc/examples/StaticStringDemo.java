package edu.austincc.examples;

public class StaticStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abcd";
		String b = new String("qrs" + "def");
		
		String p = "abc" + "rst";
	
		
		int aSize = a.length();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("abc" + "xyz");
		
		System.out.println(p);
		
	}

}
