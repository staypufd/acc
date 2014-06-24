import java.util.ArrayList;


public class Cookie {
	private String kind;
	private int size;
	private ArrayList<Topping> toppings;
	
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

	
}
