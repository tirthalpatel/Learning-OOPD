package com.tirthal.learning.design.patterns.creational.prototype;

/**
 * Client app accessing implementations of prototype pattern example
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		// Although a cloned copy, each instance is unique
		
		Shape clonedShape1 = (Shape) ShapeRegistry.getShape("1");
		System.out.println("Shape : " + clonedShape1);

		clonedShape1 = (Shape) ShapeRegistry.getShape("1");
		System.out.println("Shape : " + clonedShape1);
		
		clonedShape1 = (Shape) ShapeRegistry.getShape("1");
		System.out.println("Shape : " + clonedShape1);
		
		System.out.println("-----------");
		
		Shape clonedShape2 = (Shape) ShapeRegistry.getShape("2");
		System.out.println("Shape : " + clonedShape2);
		
		clonedShape2 = (Shape) ShapeRegistry.getShape("2");
		System.out.println("Shape : " + clonedShape2);

		System.out.println("-----------");
		
		Shape clonedShape3 = (Shape) ShapeRegistry.getShape("3");
		System.out.println("Shape : " + clonedShape3);
		
		clonedShape3 = (Shape) ShapeRegistry.getShape("3");
		System.out.println("Shape : " + clonedShape3);
	}
}
