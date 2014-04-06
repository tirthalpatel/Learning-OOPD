package com.tirthal.learning.oop.design.principles.clazz.solid.dip.authentication.good;

/**
 * High level class for login, which follows DIP.
 * 
 * In this example, the LoginManager class is not directly dependent on SimpleAuthenticator or LDAPAuthenticator implementation class. Rather it depends 
 * on Authenticator interface which provides abstractions. 
 * 
 * In case of adding new authentication mechanism in future, LoginManager and its unit test would not be changed.
 * 
 * @author tirthalp
 * 
 */
public class LoginManager {

	Authenticator authenticator;

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public void login(User user) {
		authenticator.authenticate(user);
	}
}
