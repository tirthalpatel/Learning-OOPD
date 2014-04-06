/**
 * 
 */
package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.good;

/**
 * Interface designed for connection management responsibilities of modem
 * 
 * @author tirthalp
 *
 */
public interface IConnection {
	
	public void dial(String phoneNumber);

	public void disconnect();

}
