/**
 * Class we are using in some of the Collection demos
 */

/**
 * @author samjr
 *
 */
public class Person {
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
	
	
}
