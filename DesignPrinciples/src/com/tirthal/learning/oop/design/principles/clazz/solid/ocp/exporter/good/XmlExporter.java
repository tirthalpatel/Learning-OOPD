package com.tirthal.learning.oop.design.principles.clazz.solid.ocp.exporter.good;

public class XmlExporter implements Order.Exporter {

	private Order order;

	@Override
	public void storeOrder(Order order) {
		this.order = order;

		// ... logic implementation
	}

	@Override
	public String toString() {
		return "<order><id>" + order.getId() + "</id></order>";
	}
}
