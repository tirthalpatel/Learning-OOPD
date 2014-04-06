package com.tirthal.learning.oop.design.principles.clazz.solid.isp.order.good;

/**
 * After refactoring, processOrder() is moved in another interface. So now user client is not forced to depend on it unnecessarily.
 * Also vice-versa is true, as backend job client is not forced to depend on OrderService.
 * 
 * Note - To keep example in simplest form, I didn't consider exact low-level API design of the mentioned methods.
 * 
 * @author tirthalp
 */
public interface OrderService {

	// ------------ Order services consumed by the user client

	/**
	 * Create order
	 * 
	 * @return new created order instance having unique id
	 */
	public Order createOrder();

	/**
	 * Change order
	 * 
	 * @return updated order instance
	 */
	public Order amendOrder();

	/**
	 * Cancel order
	 * 
	 * @param orderId
	 * 
	 * @return status of order cancellation operation
	 */
	public boolean cancelOrder(int orderId);

	/**
	 * Submit order
	 * 
	 * @param orderId
	 * @return submitted order instance
	 */
	public Order submitOrder(int orderId);

	/**
	 * Get order detail by order id
	 * 
	 * @param orderId
	 * @return order instance for given orderId
	 */
	public Order getOrder(int orderId);
}
