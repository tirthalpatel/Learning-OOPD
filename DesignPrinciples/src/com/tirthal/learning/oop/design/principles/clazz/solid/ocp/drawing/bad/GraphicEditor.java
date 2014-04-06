package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing.bad;

/**
 * Well, we can see here OCP is violated.
 * 
 * Because if we need to extend it to support drawing square, then it requires to change drawShape() and add new drawSquare() method in this class
 * 
 * @author tirthalp
 * 
 */
public class GraphicEditor {

	/*
	 * Draw shape as per supplied shape type
	 */
	public void drawShape(Shape s) {
		// If it is rectangle type, then draw rectangle
		if (s.m_type == 1)
			drawRectangle((Rectangle) s);
		// If it is circle type, then draw circle
		else if (s.m_type == 2)
			drawCircle((Circle) s);
		// Add more conditions to extend drawing other types of shapes...
		// Difficult to maintain numeric numbers for assigned shape types and more required testing efforts as it grows
	}

	/*
	 * Draw circle
	 */
	private void drawCircle(Circle r) {
		System.out.println("Drawing Circle");
	}

	/*
	 * Draw rectangle
	 */
	private void drawRectangle(Rectangle r) {
		System.out.println("Drawing Rectangle");
	}
}
