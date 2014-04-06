package com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.good;

/**
 * The example low level interface to provide abstraction
 * 
 * @author tirthalp
 *
 */
public interface Authenticator {

	boolean authenticate(User user);
	
}
