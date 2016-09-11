package com.tirthal.learning.design.patterns.creational.singleton;

/**
 * Client app accessing different implementations of singleton pattern for Logger example
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {

		// --- Real world example - Java Runtime
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);		
		if(r1 == r2)
			System.out.println("'" + r1 + "' and '" + r2 + "' both are same.");		
		System.out.println("-------------");
		
		// --- Custom singleton Logger instances
		
		// Option 1 - eager instantiation
		LoggerUsingEagerInstantiation.getInstance().print();
		LoggerUsingEagerInstantiation.getInstance().print();
		LoggerUsingEagerInstantiation.getInstance().print();		
		LoggerUsingEagerInstantiation instance1 = LoggerUsingEagerInstantiation.getInstance();
		LoggerUsingEagerInstantiation instance2 = LoggerUsingEagerInstantiation.getInstance();
		if(instance1 == instance2)
			System.out.println("'" + instance1 + "' and '" + instance2 + "' both are same.");		
		System.out.println("-------------");
		
		// Option 2 - lazy instantiation using double locking mechanism
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		LoggerUsingLazyInstantiationDoubleLocking.getInstance().print();
		System.out.println("-------------");

		// Option 3 - simplify singleton implementation using inner class
		LoggerUsingInnerClass.getInstance().print();
		LoggerUsingInnerClass.getInstance().print();
		LoggerUsingInnerClass.getInstance().print();
		System.out.println("-------------");
		
		// Option 4 - singleton implementation using Java 5 enum
		LoggerUsingEnum.getInstance().print();
		LoggerUsingEnum.getInstance().print();
		LoggerUsingEnum.getInstance().print();
	}

}
