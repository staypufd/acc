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
		shapes.add(new Rectangle("pink", 6.45, 9.24));
		shapes.add(new Triangle("orange", 5.73, 2.2));
		
		System.out.println("Shapes ArrayList is " + shapes.size() + " shapes long");
		
		// Loop over shapes ArrayList and have it print out the shapes class name
		for (Shape shape : shapes) {
			// \t in the string below is how we tell the computer
			// that we want a tab character
			System.out.println("\tThis shape is a: " + shape.getClass().getSimpleName());
		}
		
		
		// \n in the string below is how we tell the computer
		// we want a return character
		System.out.println("\n------------\n");
		
		// Tell each shape to speak, calcArea and sayGoodbye
		for (Shape shape : shapes) {
			System.out.println(shape.speak());
			System.out.println(shape.calcArea());
			System.out.println(shape.sayGoodbye());
			
			System.out.println("\n------------\n");
		}
		
		
		// Get the first object (a Shape or subclass of Shape) out of the ArrayList 
		// NOTE:  The originalShape is declared to hold a Shape b/c that's what we told 
		// the 'shapes' ArrayList it was holding when we created it.
		Shape originialShape = shapes.get(0);
		
		// set a aCopiedShape to null to represent no shape has been copied yet
		Shape aCopiedShape = null;
		
		// Switch ond the simpleName of the original shapes class
		switch ( originialShape.getClass().getSimpleName() ) {
			case "Circle":
				// We have to cast the originalShape from a Shape to a Circle so we can call the copy constructor
				aCopiedShape = new Circle((Circle) originialShape);
				break;
			case "Rectangle":
				// We have to cast the originalShape from a Shape to a Rectnagle so we can call the copy constructor
				aCopiedShape = new Rectangle((Rectangle) originialShape);
				break;
			case "Triangle":
				// We have to cast the originalShape from a Shape to a Triangle so we can call the copy constructor
				aCopiedShape = new Triangle((Triangle) originialShape);
				break;
	
			default:
				System.out.println("There is a shape class we don't handle.  Please fix this by adding a 'case' ");
				System.out.println("for that shape class");
				break;
		}
		
		
		// Is the copy really a copy? If so then the == comparision should be false b/c they are different objects
		boolean areSameShapes = originialShape == aCopiedShape;
		System.out.println("Is the copied shape the same as the original? " + areSameShapes);
		
		// Does the copy's component members also copies? If so then the == comparision of the composite objects should be false b/c they are different objects
		boolean areSameColors = originialShape.getColor() == aCopiedShape.getColor();
		System.out.println("Is the copied shape's color the same as the original? " + areSameColors);

	}

}
