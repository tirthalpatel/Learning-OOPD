package com.tirthal.learning.design.patterns.creational.factorymethod;

/**
 * Concrete implementation of Payment interface  
 * 
 * @author tirthalp
 *
 */
public class CreditCardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}

}
