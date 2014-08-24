package com.tirthal.learning.design.patterns.behavioral.strategy;

/**
 * A concrete implementation of payment strategy algorithm for payment by cash
 * 
 * @author tirthalp
 * 
 */
public class PayByCash implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Amount paid by cash = " + amount);
	}

}
