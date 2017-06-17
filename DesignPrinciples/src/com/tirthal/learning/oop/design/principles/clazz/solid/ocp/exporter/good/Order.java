package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.exporter.good;

/**
 * Demo of how OCP is followed, because class can be extended for new export types, such as SQL export support, without
 * modifying this class
 * 
 * @author tirthalp
 */
public class Order {

	interface Importer {
		Order fetchOrderById(int id);
	}

	interface Exporter {
		void storeOrder(Order order);
	}

	public Order(int id) {
		this.id = id;
	}
	
	public Order(Importer source) {		
		Order o = source.fetchOrderById(id);
		this.id = o.id;
	}

	public void export(Exporter destination) {
		destination.storeOrder(this);
	}	
	
	public int getId() {
		return id;
	}

	private int id;
	// + other order attributes
}