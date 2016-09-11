package com.tirthal.learning.design.patterns.creational.abstractfactory;

public class MasterCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new MasterGoldCreditCard();
			case PLATINUM:
				return new MasterEliteCreditCard();			
		}
	
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new MasterGoldValidator();
			case PLATINUM:
				return new MasterEliteValidator();			
		}
	
		return null;
	}

}
