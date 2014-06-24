/**
 * 
 */
package domain.treats;

/**
 * @author samjr
 *
 */
public class Cookie {

	private String 	kind;
	private int		size;
	
	
	/**
	 * @param kind
	 * @param size
	 */
	public Cookie(String kind, int size) {
		super();
		this.kind = kind;
		this.size = size;
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
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cookie [kind=" + kind + ", size=" + size + "]";
	}
	
}
