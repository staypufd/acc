package question.six.two;

public class Bouguet {
	public void arrangeFlowers() {
		Flowering f1 = new Rose();
		Flowering f2 = new Lily();
		f1.fragrance();
		f1.fragrance("Mmmm");
		f2.fragrance("Lilly white smell");
		
		Flowering f3 = new Flower();
		f3.fragrance("Blueberry");
		
		Flower f4 = new Flower();
		f4.fragrance("Raspberry");
	}
}
