package com.tirthal.learning.design.patterns.structural.adapter;

public class CsvFormatter implements CsvFormattable {

	@Override
	public String formatCsvText(String text, String separator) {

		if (text != null && separator != null)
			return text.replace(separator, ",");

		return null;
	}

}
