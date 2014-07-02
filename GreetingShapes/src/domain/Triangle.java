/**
 * 
 */
package domain;

/**
 * @author samjr
 *
 */
public class Triangle extends Shape {

	private double base;
	private double height;
	/**
	 * @param color
	 * @param base
	 * @param height
	 */
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	// Copy Constructor
	public Triangle(Triangle triangleToCopy) {
		super(triangleToCopy);
		this.base = triangleToCopy.base;
		this.height = triangleToCopy.height;
	}
	
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	@Override
	public double calcArea() {
		// Don't do integer division, use floats or doubles for most
		// cases.  Integer division rounds down.  1/2 = 0
		double half = 1.0d / 2;
		return  half * base * height;
	}
	
	
}
