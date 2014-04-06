package com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.bad;

/**
 * High level class for login. Why DIP is violated?
 * 
 * In this example, the LoginManager class is directly dependent on SimpleAuthenticator, which has no abstractions and is the implementing
 * class. In case of new authentication mechanism in future, LoginManager would be changed and the unit testing should be redone.
 * 
 * @author tirthalp
 * 
 */
public class LoginManager {

	SimpleAuthenticator simpleAuthenticator = new SimpleAuthenticator();

	public void login(User user) {
		simpleAuthenticator.authenticate(user);
	}
}
