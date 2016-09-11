package com.tirthal.learning.design.patterns.structural.bridge;

/**
 * an example Concrete implementation 2 for bridge pattern
 * 
 * @author tirthalp
 *
 */
public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println("-> Assembled ");
	}
}
