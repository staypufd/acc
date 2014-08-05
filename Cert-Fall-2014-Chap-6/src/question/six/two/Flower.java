package question.six.two;

public class Flower implements Flowering {
	
	protected String defaultSmell = "Skunk";
	
	public void fragrance() {
		System.out.println("Flower");
	}

	@Override
	public void fragrance(String smell) {
		System.out.println("Blah! I hate this: " + defaultSmell);
	}


	

}
