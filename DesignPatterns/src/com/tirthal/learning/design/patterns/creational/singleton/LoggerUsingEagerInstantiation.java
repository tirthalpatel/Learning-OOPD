package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Example code snippet of Logger class singleton pattern implementation for eager instantiation.
 * 
 * @author tirthalp
 */
public class LoggerUsingEagerInstantiation {

	private final static LoggerUsingEagerInstantiation m_instance = new LoggerUsingEagerInstantiation();
	
	// Private constructor prevents instantiation from other classes
	private LoggerUsingEagerInstantiation() {
		System.out.println("LoggerUsingEagerInstantiation(): Initializing Instance");
	}
	
	public static LoggerUsingEagerInstantiation getInstance() {
		return m_instance;
	}
	
	public void print() {
		System.out.println("Printing performed by object " + this);
	}
}
