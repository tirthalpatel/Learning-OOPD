package com.tirthal.learning.design.patterns.structural.adapter;

public class NewlineFormatter implements TextFormattable {

	@Override
	public String formatText(String text, String separator) {

		if (text != null && separator != null)
			return text.replace(separator, "\n");

		return null;
	}

}
