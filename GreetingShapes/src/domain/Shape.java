/**
 * 
 */
package domain;

import interfaces.Greeter;

/**
 * @author samjr
 *
 */
public abstract class Shape implements Greeter {
	private String color;
	private String nickName;
	private int age;

	/**
	 * @param color
	 */
	public Shape(String color) {
		super();
		this.color = color;
		this.age = 23;
		this.nickName = "Bigboy";
	}
	
	// Copy Constructor 
	public Shape(Shape aShapeToCopy) {
		this.color = new String(aShapeToCopy.color);
		this.nickName = new String(aShapeToCopy.nickName);
		this.age = aShapeToCopy.age;
	}
	
	
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	// Behaviors
	public abstract double calcArea();
	
	
	// Methods that implement the Greeter interface
	public String speak() {
		return "Howdy! " + this.getClass().getSimpleName();
	}
	
	public String speak(String s) {
		return "Howdy, " + s;
	}
	
	public String speak(int i) {
		// String aString = new String();
		String aString = "";
		
		// Add as many "Howdy's" as i is
		for (int j = 0; j < i; j++) {
			aString += "Howdy, ";
		}
		
		return aString + "!";
	}
	
	public String speak(Circle c) {
		return "This is specific to circle, but not in the interface: ";
	}
	
	public String speak(Object o) {
		return "We got an object of type: " + o.getClass().getSimpleName();
		
	}
	
	public String sayGoodbye() {
		return "I don't know how this shapes says goodbye";
	}


}
