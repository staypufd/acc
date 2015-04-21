
public class HR extends Employee {
	String location;

	public HR() {
		super();
		this.name = "Shabna";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("HR [location=%s, name=%s, phone=%s]", location,
				name, phone);
	}
	
	
	
	
}
