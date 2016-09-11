package com.tirthal.learning.design.patterns.structural.adapter;

/**
 * An example of incompatible interface that needs adapting
 * 
 * @author tirthalp
 *
 */
public interface CsvFormattable {

	String formatCsvText(String text, String separator);
	
}
