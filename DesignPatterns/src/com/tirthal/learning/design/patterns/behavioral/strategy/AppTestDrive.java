package com.tirthal.learning.design.patterns.behavioral.strategy;

/**
 * Client app for the demo of strategy pattern implementation for Payment methods
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		// Client makes use of an encapsulated family of algorithms for payment
		
		// OO principle - programming to an interface, not an implementation		
		Merchant m = new MakeMyTrip();
		m.pay(50); // By default it pays by cash
		m.setPaymentMode(new PayByPaypal()); // Change payment mode to Paypal
		m.pay(100);
		
		m = new Myntra();
		m.setPaymentMode(new PayByCreditCard());
		m.pay(1000);				
	}

}
