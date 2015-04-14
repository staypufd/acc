package edu.austincc.examples;
import java.util.ArrayList;


public class OverloadExample {

	int a[]; 
	
	float b;
	
	ArrayList<Number> al = new ArrayList<Number>();
	
	int foo(Object o) {
		return 0;
	}
	
	int foo(Integer o) {
		return o.intValue();
	}
	
	protected int foo(int o) {
		return o;
	}
	
	protected int foo(int o, float a) {
		return 25;
	}
	
	protected int foo(int o, double a) {
		return 50;
	}
	
	protected int foo(int o, int a) {
		return 75;
	}
	
	int foo(float a, int o) {
		return 10;
	}
	
	private double foo(double o) {
		return 56.99 * o;
	}
	
	public double foo(float o) {
		return 23.66;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadExample oe = new OverloadExample();
		
		System.out.println(oe.foo(new Integer(5)));
		System.out.println(oe.foo(10));
		
		System.out.println(oe.foo(45.69));
		System.out.println(oe.foo(45.69f));
		
		oe.b = 45.909f;
		
	oe.al.add(new Float(5.689));
	oe.al.add(new Short((short)2));
	oe.al.add(new Double(45.893834947834));
	
	
	System.out.println(oe.foo(1, 2f));
	System.out.println(oe.foo(1, 2.0));
	System.out.println(oe.foo(1, 2.0f));
	System.out.println(oe.foo(1, 2));
	
	}

}
