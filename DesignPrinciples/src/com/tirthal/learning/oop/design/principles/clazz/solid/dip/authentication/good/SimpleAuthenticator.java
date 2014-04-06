package com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.good;

/**
 * The example low level class, which would provide implementation of authentication by database
 * 
 * @author tirthalp
 *
 */
public class SimpleAuthenticator implements Authenticator {

	@Override
	public boolean authenticate(User user) {
		// logic - database
		return true;
	}
}
