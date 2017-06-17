package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.exporter.good;

import java.io.Reader;

public class XmlImporter implements Order.Importer {

	@SuppressWarnings("unused")
	private Reader in;
	
	public XmlImporter(Reader in) {
		this.in = in;
	}
	
	@Override
	public Order fetchOrderById(int id) {		
		
		// ... logic implementation		
		
		return new Order(123);
	}
}
