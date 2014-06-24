
public class Topping {
	private String	name;
	private String	color;
	private float 	price;
	
	/**
	 * @param name
	 * @param color
	 * @param price
	 */
	public Topping(String name, String color, float price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Topping [name=" + name + ", color=" + color + ", price="
				+ price + "]";
	}



}
