package com.tirthal.learning.design.patterns.structural.adapter;

/**
 * An example of the target interface that clients communicate with
 * 
 * @author tirthalp
 *
 */
public interface TextFormattable {

	String formatText(String text, String separator);
	
}
