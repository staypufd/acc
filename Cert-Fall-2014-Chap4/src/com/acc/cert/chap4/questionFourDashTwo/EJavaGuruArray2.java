package com.acc.cert.chap4.questionFourDashTwo;

import java.io.Console;
import java.util.HashMap;

public class EJavaGuruArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2 = new int[3];
		char[] arr3 = {'a', 'b'};
		
		arr1 = arr2;
		arr3 = "abc".toCharArray();
		
		System.out.println(arr1[0] + ":" + arr1[1]);

		
		char[] name1 = {'S','a','m',' ','G','r','i','f','f','i','t','h'};
		char[] copiedName = new char[name1.length];
		
		for (int i = 0; i < copiedName.length; i++) {
			copiedName[(name1.length - 1) - i] = name1[i];
		}
		
		System.out.println(name1);
		System.out.println(copiedName);
		
		Object[] objects = new Object[19];
		objects[1] = new Integer(5);
		objects[2] = new HashMap<String, String>();
		
		StringBuffer sb = new StringBuffer();
		sb.append('a');
		sb.append(" ab\nc");
		sb.append(objects[1]);
		sb.append("This is a really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, long string");
		sb.append('g');
		sb.append("This is a really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, long string");
		sb.append("This is a really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, really, long string");
		sb.append(5.43939f);
		sb.insert(7, 'q');
		sb.replace(7, 8, "w");
		
		StringBuilder strbuilder = new StringBuilder();
		
		System.out.println(sb);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
