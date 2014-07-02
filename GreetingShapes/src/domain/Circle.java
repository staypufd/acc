/**
 * 
 */
package domain;

/**
 * @author samjr
 *
 */
public class Circle extends Shape {
	
	private double radius;

	/**
	 * @param color
	 */
	public Circle(String color, double radius) {
		super(color);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	public Circle(Circle originalShape) {
		super(originalShape);
		this.radius = originalShape.radius;
	}



	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}



	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cirlce [radius=" + radius + "]";
	}



	/* (non-Javadoc)
	 * @see domain.Shape#calcArea()
	 */
	@Override
	public double calcArea() {
		// area of a circle equation is Pi * radius^2
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String speak() {
		return "I am a circle hear me roll!";
	}

	
}
