package com.tirthal.learning.design.patterns.creational.abstractfactory;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard cc) {
		
		// credit card validation logic ...
		
		return false;
	}

}
