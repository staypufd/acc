/**
 * Class we are using in some of the Collection demos
 */

/**
 * @author samjr
 *
 */
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private char sex;
	private String city;
	private String state;
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param city
	 * @param state
	 */
	public Person(String name, int age, char sex, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.city = city;
		this.state = state;
	}
	
	// Copy Constructor
	public Person(Person aPerson) {
		super();
		this.name = new String(aPerson.getName());
		this.age = aPerson.age;
		this.sex = aPerson.sex;
		this.city = new String(aPerson.getCity());
		this.state = new String(aPerson.getState());
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		switch (sex) {
		case 'm' | 'M':
			this.sex = sex;
			break;
			
		case 'f' | 'F':
			this.sex = sex;
			break;

		default:
			throw new RuntimeException("Sex must be either Male (m or M) or Femail (f or F)");
		}
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", city=" + city + ", state=" + state + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		
		// See more about compareTo at this tutorial including multiple value comparison:  
		// http://www.javapractices.com/topic/TopicAction.do?Id=10
		
		return this.getName().compareTo(o.getName());

		// Compare based on age
		// return new Integer(this.getAge()).compareTo(new Integer(o.getAge()));
		
	}
	
	
}
