package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.good;

//If you don't know what is delegation principle, then please refer com.tirthal.learning.oop.concepts.Delegation_TestDrive
/**
 * Modem class using Delegation design principle.
 * 
 * @author tirthalp
 * 
 */
public class Modem implements IConnection, IDataChannel {

	private IConnection connection;
	private IDataChannel dataChannel;

	public Modem(IConnection connection, IDataChannel dataChannel) {
		this.connection = connection;
		this.dataChannel = dataChannel;
	}

	@Override
	public void dial(String phoneNumber) {
		connection.dial(phoneNumber);
	}

	@Override
	public void disconnect() {
		connection.disconnect();
	}

	@Override
	public void send(char c) {
		dataChannel.send(c);
	}

	@Override
	public char receive() {
		return dataChannel.receive();
	}
}
