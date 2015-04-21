
public class Employee extends Object {
	String name;
	String phone;
	
	public Employee() {
		super();
		this.foo();

	}
	
	private void foo() {
		this.name = "Jill";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", phone=")
				.append(phone).append("]");
		return builder.toString();
	}
	
	
	
}
