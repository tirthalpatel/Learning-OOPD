package com.tirthal.learning.design.patterns.structural.decorator;

/**
 * Beverage is supertype, which will offer each subclass concreate components to be used on its own, or wrapped by decorator component
 * 
 * @author tirthalp
 * 
 */
public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	// enforce to implement cost method in the sub class
	public abstract double cost();
}
