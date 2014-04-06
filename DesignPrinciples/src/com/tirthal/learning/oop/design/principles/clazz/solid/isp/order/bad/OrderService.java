package com.tirthal.learning.oop.design.principles.clazz.solid.isp.order.bad;

/**
 * Why ISP is violated here in the order service design? Because,
 * 
 * User client - Forced to depend on process order unnecessarily.
 * 
 * Backend job client - only need process order, but still forced to depend on other services too.
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

	// ------------ Order services consumed by the backend/integration job client

	/**
	 * This is responsible for processing the order for delivery
	 * 
	 * @return status of the order processed by job
	 */
	public boolean processOrder(int orderId);
}
