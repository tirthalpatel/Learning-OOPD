package com.tirthal.learning.design.patterns.structural.adapter;

/**
 * An example adapter class that adapts the Adaptee to the Target
 * 
 * @author tirthalp
 *
 */
public class CsvAdapterImpl implements TextFormattable {

	private CsvFormatter cf;
	
	public CsvAdapterImpl(CsvFormatter cf) {
		this.cf = cf;
	}
	
	@Override
	public String formatText(String text, String separator) {
		
		return cf.formatCsvText(text, separator);
	}
	
}
