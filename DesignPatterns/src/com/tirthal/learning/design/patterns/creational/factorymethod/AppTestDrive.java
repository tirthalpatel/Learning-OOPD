package com.tirthal.learning.design.patterns.creational.factorymethod;

import java.util.Calendar;

/**
 * Client app accessing example factory method pattern implementation
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		// --- Real world example - Java Calendar
		Calendar cal = Calendar.getInstance();		
		System.out.println(cal);
		System.out.println("-----------------------------");
		
		// --- Custom factory method example for Payment use case
		Payment p = PaymentFactory.getInstance();
		p.pay();
		
		p = PaymentFactory.getInstance(PaymentOptions.NET_BANKING);
		p.pay();
		
		p = PaymentFactory.getInstance(PaymentOptions.CREDIT_CARD);
		p.pay();
		
		p = PaymentFactory.getInstance(PaymentOptions.CASH);
		p.pay();
		
		// Awesome: Factory method promotes the loose-coupling by hiding object instantiation logic from client code
	}
}
