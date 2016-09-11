package com.tirthal.learning.design.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Client app for demo of adapter pattern 
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String args[]) {
		
		// --- Real world example - Arrays.asList : convert Arrays -> List
		String[] colorsArray = new String[]{"red", "blue", "white", "black"};
		List<String> colorsList = Arrays.asList(colorsArray);
		System.out.println(colorsArray + " -> " + colorsList);
		System.out.println("---------------------------");
		
		// --- Custom Adapter pattern example
		String input = "Hello world 1. Hello world 2. Hello world 3. Hello world 4. Hello world 5. ";
		
		TextFormattable tf = new NewlineFormatter();
		System.out.println(tf.formatText(input, ". "));
		
		// tf = new CsvFormatter(); // Obviously incompatible interface, so need adaptor
		tf = new CsvAdapterImpl(new CsvFormatter());
		System.out.println(tf.formatText(input, "."));
		
		// Likewise, there could be multiple adaptors as per need
	}
}
