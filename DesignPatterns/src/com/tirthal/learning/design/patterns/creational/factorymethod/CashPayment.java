package com.tirthal.learning.design.patterns.creational.factorymethod;

/**
 * Concrete implementation of Payment interface  
 * 
 * @author tirthalp
 *
 */
public class CashPayment implements Payment {

	@Override
	public void pay() {		
		System.out.println("This is cash payment");
	}

}
