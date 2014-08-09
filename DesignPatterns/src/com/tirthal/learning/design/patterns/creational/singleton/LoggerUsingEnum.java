package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Example code snippet of Logger class singleton pattern implementation using Java 5 Enum.
 * 
 * @author tirthalp
 */
public enum LoggerUsingEnum {

	// By default creation of Enum instance is thread safe but any other method on Enum is programmers responsibility.
	INSTANCE;

	public void print() {
		System.out.println("Printing performed by object " + this.hashCode());
	}
}
