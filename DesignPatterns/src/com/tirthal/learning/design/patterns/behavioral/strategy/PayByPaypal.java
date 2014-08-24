package com.tirthal.learning.design.patterns.behavioral.strategy;

/**
 * A concrete implementation of payment strategy algorithm for payment by Paypal
 * 
 * @author tirthalp
 * 
 */
public class PayByPaypal implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Amount paid by paypal gateway = " + amount);
	}

}