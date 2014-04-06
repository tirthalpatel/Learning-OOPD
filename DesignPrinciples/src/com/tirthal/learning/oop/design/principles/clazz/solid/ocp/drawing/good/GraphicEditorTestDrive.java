package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing.good;

/**
 * Implementation of drawing editor
 * 
 * @author tirthalp
 * 
 */
public class GraphicEditorTestDrive {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();

		Shape s = new Rectangle();
		ge.drawShape(s);

		s = new Circle();
		ge.drawShape(s);
	}

}
