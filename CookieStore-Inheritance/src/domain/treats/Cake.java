/**
 * 
 */
package domain.treats;

/**
 * @author samjr
 *
 */
public class Cake extends ConfectionaryItem {
	private int 		size;
	/**
	 * @param kind
	 * @param size
	 */
	public Cake(String kind, int size) {
		super();
		this.kind = kind;
		this.size = size;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cake [kind=" + kind + ", size=" + size + "]";
	}
	
	// Behavior
	@Override
	public void eatMe3() {
		super.eatMe3();
		System.out.println("Cake eatMe3");
	}
}
