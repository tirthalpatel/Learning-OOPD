package com.tirthal.learning.design.patterns.creational.abstractfactory;

/**
 * Example of Abstract Factory
 * 
 * @author tirthalp
 *
 */
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if(creditScore > 750) {
			return new AmexFactory();
		}
		else if(creditScore <= 750 && creditScore >= 500) {
			return new MasterCardFactory();
		}
		else {
			return new VisaFactory();
		}
		
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);	
}
