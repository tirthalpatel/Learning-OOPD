/**
 * 
 */
package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad;

/**
 * Design of ModemSlow interface.
 * 
 * Why is it bad design? What's the problem?
 * 
 * It has two responsibilities - Connection management + Data Management. Hence SRP is violated.
 * 
 * @author tirthalp
 */
public interface IModem {

	// --- Connection management responsibilities = dial, disconnect
	
	public void dial(String phoneNumber);

	public void disconnect();

	// --- Data management responsibilities = send, receive
	
	public void send(char c);

	public char receive();
}
