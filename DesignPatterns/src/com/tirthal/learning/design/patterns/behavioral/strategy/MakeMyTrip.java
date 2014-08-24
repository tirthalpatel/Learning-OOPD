package com.tirthal.learning.design.patterns.behavioral.strategy;

public class MakeMyTrip extends Merchant {

	@Override
	protected void printMessage() {
		System.out.println("Your payment is successful. Thank you for booking tickets with MakeMyTrip.com and hope to see you again!!!");		
	}

}
