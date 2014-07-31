package com.acc.cert.chap4;

import java.util.ArrayList;

public class AnotherClass {

	// Class variable
		static ArrayList<Object> AO = new ArrayList<>();
		static String klassNickName = "ThePlayGroundForStrs";
		
		// Instance variable
		String myString = "abc";
		
		// Class Methods
		public static String getNickName() {
			return klassNickName;
		}
		
		// Instance Methods
		
		public void foo() {
			System.out.println(getNickName());
		}

}
