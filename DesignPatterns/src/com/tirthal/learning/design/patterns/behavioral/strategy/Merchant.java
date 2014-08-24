package com.tirthal.learning.design.patterns.behavioral.strategy;

/**
 * The Merchant client make use of use of an encapsulated family of algorithms for payment using PaymentStrategy interface
 * 
 * @author tirthalp
 * 
 */
public abstract class Merchant {

	private PaymentStrategy paymentMode;

	// By default make payment mode by cash 
	public Merchant() {
		paymentMode = new PayByCash();
	}
	
	// Allow to set behavior dynamically
	public void setPaymentMode(PaymentStrategy paymentMode) {
		this.paymentMode = paymentMode;
	}

	// Delegate to the behavior class
	public void pay(int amount) {
		paymentMode.pay(amount);
		printMessage();
		System.out.println("---");
	}

	// Each merchant can display different message
	protected abstract void printMessage();
}
