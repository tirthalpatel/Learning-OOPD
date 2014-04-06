package com.tirthal.learning.oop.design.principles.clazz.solid.srp.modem.bad;

/**
 * This is client or consumer of ModemSlow class.
 * 
 * @author tirthalp
 */
public class ModemSlowClient {	
	
	public static void main(String[] args) {
				
		IModem slowModem = new ModemSlow();
		
		slowModem.dial("0000000000");
		slowModem.send('t');
		slowModem.receive();
		slowModem.disconnect();
	}

}
