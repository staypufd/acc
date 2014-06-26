/**
 * 
 */
package domain.treats;

/**
 * @author samjr
 *
 */
public class Candy extends ConfectionaryItem {
	private int 		pieces;
	
	/**
	 * @param kind
	 * @param pieces
	 */
	public Candy(String kind, int pieces) {
		super();
		this.kind = kind;
		this.pieces = pieces;
	}

	/**
	 * @return the pieces
	 */
	public int getPieces() {
		return pieces;
	}

	/**
	 * @param pieces the pieces to set
	 */
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candy [kind=" + kind + ", pieces=" + pieces + "]";
	}
	
	// Behavior
	public void eatMe3() {
		super.eatMe3();
		System.out.println("Candy eatMe3");
	}
}
