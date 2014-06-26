package domain.treats;

public abstract class ConfectionaryItem {

	// Instance variables
	protected String kind;

	// Constructors
	public ConfectionaryItem() {
		super();
		this.kind = "nothing";
	}

	// Getters and Setters
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
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "kind=" + kind;
	}

	// Behaviors
	public void eatMe() {
		System.out.println("Ouch, someone bit me!  Hold on, I've only been alive a few hours!");
	}
	
//	private void eatMe2() {
//		System.out.println("This should not be visible in a subclass");
//	}
	
	protected void eatMe3() {
		System.out.println("The protected eatMe3 in " + getClass().getName());
	}

}