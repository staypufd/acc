/**
 * 
 */
package domain;

/**
 * @author samjr
 *
 */
public class Rectangle extends Shape {

	private double length, width;
	
	/**
	 * @param color
	 */
	public Rectangle(String color, double length, double width) {
		super(color);
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}

	/* (non-Javadoc)
	 * @see domain.Shape#calcArea()
	 */
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String speak() {
		
		return super.speak() + ", " + "all my freinds used to say I was so square but now I've stretched my abilities";
	}

}
