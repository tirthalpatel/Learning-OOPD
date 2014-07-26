package com.tirthal.learning.design.patterns.gof.creational.singleton;

import java.io.Serializable;

//Lazy instantiation using double locking mechanism.
class Singleton implements Serializable
{
	private static final long serialVersionUID = 1L;
	private static Singleton m_instance;

	private Singleton()
	{
		System.out.println("Singleton(): Initializing Instance");
	}

	public static Singleton getInstance()
	{
		if (m_instance == null)
		{
			synchronized(Singleton.class)
			{
				if (m_instance == null)
				{
					System.out.println("getInstance(): First time getInstance was invoked!");
					m_instance = new Singleton();
				}
			}            
		}

		return m_instance;
	}
	
	// This method is called immediately after an object of this class is deserialized.
	// This method returns the singleton instance.
	protected Object readResolve() {
		return getInstance();
	}

	public void doSomething()
	{
		System.out.println("doSomething(): Singleton does something!");
	}
}
