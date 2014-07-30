package domain;

public class Person {
	private String name;
	private int height;
	private int age;
	
	public Person() {
		// Does nothing
	}
	
	public Person(String name) {
		this.name = name;
		this.height = 22;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
