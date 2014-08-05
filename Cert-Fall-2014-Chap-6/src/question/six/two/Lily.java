package question.six.two;

public class Lily extends Flower {
	public void fragrance() {
		System.out.println("Lily");
	}

	@Override
	public void fragrance(String smell) {
		System.out.println("Smells so nice, " + smell);
	}
}
