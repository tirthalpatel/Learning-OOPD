package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.exporter.bad;

import java.io.Writer;

/**
 * Demo of how OCP is violated? Because to support SQL export, this class needs modification.
 * 
 * @author tirthalp
 */
public class Order {

	@SuppressWarnings("unused")
	private int id;
	// + other order attributes
	
	public Order(int id) {
		this.id = id;
	}
	
	public Order(String source, Format inputFormat) {
		// ... logic implementation
	}
	
	public enum Format { JSON, XML }; // Add new formats in future
	
	public void exportAsJson(Writer out) {		
		// ... logic implementation
	}
	
	public void exportAsXml(Writer out) {
		// ... logic implementation
	}
}
