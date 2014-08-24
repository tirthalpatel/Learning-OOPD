package com.tirthal.learning.design.patterns.behavioral.strategy;

/**
 * The interface to specify the signature of an algorithm (i.e. a behavior) for the Payment Strategy
 * 
 * @author tirthalp
 * 
 */
public interface PaymentStrategy {

	public void pay(int amount);

}
