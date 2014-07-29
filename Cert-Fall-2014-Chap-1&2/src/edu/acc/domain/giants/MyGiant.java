package edu.acc.domain.giants;

import edu.acc.domain.FooInf;

public class MyGiant implements FooInf {
	@Override
	public int bazz() {
		// TODO Auto-generated method stub
		return -122;
	}

	@Override
	public float foo() {
		// TODO Auto-generated method stub
		return -555;
	}

	private String name;

	public MyGiant(String aName) {
		this.name = aName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}