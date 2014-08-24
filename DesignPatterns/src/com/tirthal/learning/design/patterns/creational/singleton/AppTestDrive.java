package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Client app accessing different implementations of singleton pattern for Logger example
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {

		// Option 1 - lazy instantiation using double locking mechanism
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		System.out.println("-------------");

		// Option 2 - simplify singleton implementation using inner class
		LoggerUsingInnerClass.getInstance().print();
		LoggerUsingInnerClass.getInstance().print();
		LoggerUsingInnerClass.getInstance().print();
		System.out.println("-------------");
		
		// Option 3 - singleton implementation using Java 5 enum
		LoggerUsingEnum.getInstance().print();
		LoggerUsingEnum.getInstance().print();
		LoggerUsingEnum.getInstance().print();
	}

}
