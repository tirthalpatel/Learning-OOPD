package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.drawing.good;

/**
 * OCP is followed, as to extend functionality this class does not require to change
 * 
 * @author tirthalp
 * 
 */
public class GraphicEditor {

	public void drawShape(Shape s) {
		s.draw();
	}
}
