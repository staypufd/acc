package edu.austincc.examples;

public class Dog {
	
	String name = "Sam";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [name=").append(name).append("]");
		builder.append(" This is cool!");
		builder.replace(11, 14, "*@!!$^#");
		builder.reverse();
		return builder.toString();
	}


	public static void main(String[] args) {
		Dog d = new Dog();
		
		boolean s = d.name.contains("a");

		System.out.println(s);
		
		System.out.println(String.valueOf(45.23));


	}




}
