
public class Cookie {
	private String kind;
	private int size;
	private Topping topping1;
	private Topping topping2;
	
	public Cookie(String kind, int size) {
		this.kind = kind;
		this.size = size;
	}
	
	public Cookie(String kind, int size, Topping topping1, Topping topping2) {
		this.kind = kind;
		this.size = size;
		this.topping1 = topping1;
		this.topping2 = topping2;
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
	 * @return the topping1
	 */
	public Topping getTopping1() {
		return topping1;
	}
	/**
	 * @param topping1 the topping1 to set
	 */
	public void setTopping1(Topping topping1) {
		this.topping1 = topping1;
	}
	/**
	 * @return the topping2
	 */
	public Topping getTopping2() {
		return topping2;
	}
	/**
	 * @param topping2 the topping2 to set
	 */
	public void setTopping2(Topping topping2) {
		this.topping2 = topping2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cookie [kind=" + kind + ", size=" + size + ", topping1="
				+ topping1 + ", topping2=" + topping2 + "]";
	}
	
}
