import java.util.ArrayList;


public class Cookie {
	private String kind;
	private int size;
	private ArrayList<Topping> toppings;
	private float cookieBasePrice = 1.00f;
	
	public Cookie(String kind, int size) {
		this.kind = kind;
		this.size = size;
		this.toppings = new ArrayList<Topping>();
	}
	
	public Cookie(String kind, int size, ArrayList<Topping> toppings) {
		this.kind = kind;
		this.size = size;
		this.toppings = toppings;
	}
	
	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the toppings
	 */
	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	/**
	 * @param toppings the toppings to set
	 */
	public void setToppings(ArrayList<Topping> toppings) {
		this.toppings = toppings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cookie [kind=" + kind + ", size=" + size + ", toppings="
				+ toppings + "]";
	}

	// Instance methods
	public float totalPrice() {
		
		// Set a starting total price of 0
		float totalPrice = 0.0f;
		
		// Price all the toppings
		for (Topping topping : this.getToppings()) {
			totalPrice += topping.getPrice();
		}
		
		// Price the cookie based on it's basePrice * it's size
		totalPrice += (cookieBasePrice * this.getSize());
		
//		if (this.getKind().equalsIgnoreCase("Peanut Butter") || 
//				(this.getKind().equalsIgnoreCase("peanutbutter"))) {
//			totalPrice += 0.50f;
//		} else if (this.getKind().equalsIgnoreCase("red velvet")) {
//			// Add some markup for your kind of cookie to the price
//			totalPrice += 2.00f;
//		}
		
		// Based on which kind of cookie add a markup to the cost
		switch (this.getKind().toLowerCase()) {
		case "peanut butter":
		case "peanutbutter":
			totalPrice += 0.50f;
			break;
		case "red velvet":
			totalPrice += 2.00f;
			break;

		default:
			break;
		}
		
		
		return totalPrice;
		
	}
	
	
}
