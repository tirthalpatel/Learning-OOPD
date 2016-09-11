package com.tirthal.learning.design.patterns.creational.factorymethod;

/**
 * Example implementation of Factory method pattern
 * 
 * @author tirthalp
 *
 */
public class PaymentFactory {			
	
	// Factory methods to return payment instance type
	public static Payment getInstance(PaymentOptions option) {										
		return createPaymentType(option);
	}
		
	public static Payment getInstance() {
		return createPaymentType(null);
	}
	
	// Object instantiation logic
	private static Payment createPaymentType(PaymentOptions option) {
		if(option==null)
			return new CashPayment(); // default payment option	 
		
		switch(option) {
			case CASH: 
				return new CashPayment();
			case CREDIT_CARD:
				return new CreditCardPayment();
			case NET_BANKING:
				return new NetbankingPayment();			
			default:
				return new CashPayment(); // default payment option		
		}	
	}
}