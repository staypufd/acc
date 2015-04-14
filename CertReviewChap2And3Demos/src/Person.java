


public class Person implements Sizeable{
	
	private int size;
	
	public Person(int mySize) {
		this.size = mySize;
	}

	public boolean isBig() {
		if (this.size() > 10) {
			return true;
		}
		
		return false;
	}
	
	public boolean sameSizeAs(Sizeable o) {
		return this.size() == o.size();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 50;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(5);
		Person p2 = new Person(20);
		
		if ( p1.isBig() ) {
			System.out.println("P1 is Big");
		}
		
		if (p2.isBig()) {
			System.out.println("P2 is Big");
		}
		
		System.out.println(p1.sameSizeAs(p2));
		
		
		Animal a = new Animal();
		
		System.out.println(p1.sameSizeAs(a));
		
	}



}
