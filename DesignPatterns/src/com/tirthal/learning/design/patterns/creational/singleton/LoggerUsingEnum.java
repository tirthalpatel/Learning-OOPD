package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Example code snippet of Logger class singleton pattern implementation using Java 5 Enum.
 * 
 * @author tirthalp
 */
public class LoggerUsingEnum {

	// By default creation of Enum instance is thread safe but any other method on Enum is programmers responsibility
	// Also witn Enum singleton, serialization is guaranteed by JVM
	private static enum Singleton {

		INSTANCE;

		private static final LoggerUsingEnum m_instance = new LoggerUsingEnum();

		public LoggerUsingEnum getSingleton() {
			return m_instance;
		}
	}

	// Private constructor prevents instantiation from other classes
	private LoggerUsingEnum() {

	}

	/*
	 * You can't call the constructor and you can only get an instance of your LoggerUsingEnum() class via the INSTANCE in the private Singleton enum
	 * - which is guaranteed to be created once and only once
	 */
	public static LoggerUsingEnum getInstance() {
		return LoggerUsingEnum.Singleton.INSTANCE.getSingleton();
	}

	public void print() {
		System.out.println("Printing performed by object " + this);
	}
}
