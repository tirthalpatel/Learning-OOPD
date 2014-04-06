package com.tirthal.learning.oop.design.principles.clazz.solid.isp.order.good;

/**
 * After refactoring, all services apart from processOrder() are kept in another interface. So now backend job client is not forced to depend on 
 * those unnecessary OrderService(s).
 * 
 * Note - To keep example in simplest form, I didn't consider exact low-level API design of the mentioned methods.
 * 
 * @author tirthalp
 */
public interface OrderProcessingService {

	// ------------ Order services consumed by the backend/integration job client

	/**
	 * This is responsible for processing the order for delivery
	 * 
	 * @return status of the order processed by job
	 */
	public boolean processOrder(int orderId);
}
