package com.tirthal.learning.design.patterns.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Client app for demo of decorator pattern to prepare beverage with choice of condiments
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String args[]) throws IOException {
		
		// --- Real world example - OutputStream
		
		File f = new File("./target/temp.txt");
		f.createNewFile();
		
		OutputStream os = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeChars("Hello World!");
		dos.close();
		
		// --- Custom decorator patter example
		
		// Select type of beverage
		Beverage beverage = new RedTea();

		// Decorate with condiments like milk, sugar, tea masala...
		beverage = new Milk(beverage);
		beverage = new Sugar(beverage);
		beverage = new TeaMasala(beverage);

		// Print beverage and opted condiments description along with total price
		System.out.println("Total cost of '" + beverage.getDescription() + "' = Rs. " + beverage.cost());
	}
}
