package com.tirthal.learning.design.patterns.creational.abstractfactory;

/**
 * Client app accessing example abstract factory pattern implementation
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(900);
		
		CreditCard card1 = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card1);
		
		System.out.println("------------------");
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(450);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2);

	}

}
