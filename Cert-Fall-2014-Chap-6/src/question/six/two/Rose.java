package question.six.two;

public class Rose extends Flower  {
	/* (non-Javadoc)
	 * @see question.six.two.Flowering#fragrance()
	 */
	@Override
	public void fragrance() {
		System.out.println("Rose");
	}
	
	@Override
	public void fragrance(String aSmell) {
		System.out.println(aSmell + " Smells like teen spirit!");
	}
	
	public void fragrance(int stinkCount) {
		for (int i = 0; i < stinkCount; i++) {
			System.out.println("Stinky!!!!");
		}
	}

}
