package com.tirthal.learning.design.patterns.creational.prototype;

import java.util.Hashtable;

/**
 * A registry / cache, which avoids costly object creation and provides cloned object
 * 
 * @author tirthalp
 */
public class ShapeRegistry {

	private static Hashtable<String, Shape> shapesCache = new Hashtable<String, Shape>();

	static {
		loadShapes();
	}

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapesCache.get(shapeId);

		// Typically avoid usage of "new". Rather returns unique instance as a cloned copy.
		return (Shape) cachedShape.clone();
	}

	/*
	 * Assume, initial creation of each object is an expensive operation here. May be for each shape, it needs to run
	 * database query.
	 * 
	 * So instead of triggering that process every time, better to cache them using shapesCache.put(shapeKey, shape).
	 */
	private static void loadShapes() {
		Circle circle = new Circle();
		circle.setId("1");
		shapesCache.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapesCache.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapesCache.put(rectangle.getId(), rectangle);
	}
}
