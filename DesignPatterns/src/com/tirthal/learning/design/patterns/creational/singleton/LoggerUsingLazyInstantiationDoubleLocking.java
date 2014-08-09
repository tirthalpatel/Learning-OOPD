package com.tirthal.learning.design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * Example code snippet of Logger class singleton pattern implementation for lazy instantiation using double locking mechanism.
 * 
 * @author tirthalp
 */
public class LoggerUsingLazyInstantiationDoubleLocking implements Serializable {
	private static final long serialVersionUID = 1L;
	private static LoggerUsingLazyInstantiationDoubleLocking m_instance;

	// Private constructor prevents instantiation from other classes
	private LoggerUsingLazyInstantiationDoubleLocking() {
		System.out.println("LoggerUsingLazyInstantiationDoubleLocking(): Initializing Instance");
	}

	/*
	 * The singleton instance is created when the getInstance() method is called for the first time. This is called lazy instantiation and it ensures
	 * that the singleton instance is created only when it is needed.
	 */
	public static LoggerUsingLazyInstantiationDoubleLocking getInstance() {
		if (m_instance == null) {
			synchronized (LoggerUsingLazyInstantiationDoubleLocking.class) {
				if (m_instance == null) {
					System.out.println("getInstance(): First time getInstance was invoked!");
					m_instance = new LoggerUsingLazyInstantiationDoubleLocking();
				}
			}
		}

		return m_instance;
	}

	/*
	 * When Singletons are implementing Serializable interface they have to implement readResolve method in order to avoid having 2 different objects.
	 * This method is called immediately after an object of this class is deserialized. This method returns the singleton instance.
	 */
	protected Object readResolve() {
		return getInstance();
	}

	public void print() {
		System.out.println("Printing performed by object " + this);
	}
}
