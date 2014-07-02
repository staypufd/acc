/**
 * 
 */
package main;

import java.util.ArrayList;

import domain.Circle;
import domain.Rectangle;
import domain.Shape;
import domain.Triangle;

/**
 * @author samjr
 *
 */
public class GreeterShapesMain {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args)  {
		ArrayList<Shape> shapes = new ArrayList<>();

		shapes.add(new Circle("red", 5));
		shapes.add(new Rectangle("pink", 6.0, 9.2));
		shapes.add(new Triangle("orange", 5.0, 2.2));
		
		System.out.println("Shapes ArrayList is " + shapes.size() + " shapes long");
		
		for (Shape shape : shapes) {
			// \t in the string below is how we tell the computer
			// that we want a tab character
			System.out.println("\tThis shape is a: " + shape.getClass().getName());
		}
		
		
		// \n in the string below is how we tell the computer
		// we want a return character
		System.out.println("\n------------\n");
		
		for (Shape shape : shapes) {
			System.out.println(shape.speak());
			System.out.println(shape.calcArea());
			System.out.println(shape.sayGoodbye());
			
			System.out.println("\n------------\n");
		}
		
		Circle originalShape = (Circle) shapes.get(0);
		Circle aCopiedShape = new Circle(originalShape);
		
		System.out.println(originalShape == aCopiedShape);
		System.out.println(originalShape.getColor() == aCopiedShape.getColor());

	}

}
