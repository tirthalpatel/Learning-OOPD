package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Example code snippet of Logger class singleton pattern implementation using inner class approach.
 * 
 * @author tirthalp
 */
public class LoggerUsingInnerClass {

	// Private constructor prevents instantiation from other classes
	private LoggerUsingInnerClass() {
		System.out.println("LoggerUsingInnerClass(): Initializing Instance");
	}

	/*
	 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment that getInstance() is called.
	 * Thus, this solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).
	 * 
	 * To sum up, LoggerHolder is loaded on the first execution of LoggerUsingInnerClass.getInstance() or the first access to LoggerHolder.INSTANCE,
	 * not before.
	 */
	private static class LoggerHolder {
		private static final LoggerUsingInnerClass INSTANCE = new LoggerUsingInnerClass();
	}

	public static LoggerUsingInnerClass getInstance() {		
		return LoggerHolder.INSTANCE;
	}
	
	public void print() {
		System.out.println("Printing performed by object " + this);
	}
}
