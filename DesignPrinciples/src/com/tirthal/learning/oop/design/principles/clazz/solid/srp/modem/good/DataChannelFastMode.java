package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.good;

/**
 * Implementation class of IDataChannel interface for "fast mode" of data send and receive. This is for design demo, so actual logic is not
 * implemented
 * 
 * @author tirthalp
 * 
 */
public class DataChannelFastMode implements IDataChannel {

	@Override
	public void send(char c) {
		// TODO Auto-generated method stub
		System.out.println("sent data using fast algorithm");
	}

	@Override
	public char receive() {
		// TODO Auto-generated method stub
		System.out.println("received data using fast algorithm");
		return 0;
	}

}
