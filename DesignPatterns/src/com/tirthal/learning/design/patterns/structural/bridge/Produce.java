package com.tirthal.learning.design.patterns.structural.bridge;

/**
 * An example Concrete implementation 1 for bridge pattern
 * 
 * @author tirthalp
 *
 */
public class Produce implements Workshop {

	@Override
	public void work() {
		System.out.print("-> Produced ");
	}
}