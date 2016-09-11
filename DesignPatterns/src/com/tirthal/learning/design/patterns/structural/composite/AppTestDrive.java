package com.tirthal.learning.design.patterns.structural.composite;

/**
 * Client app for demo of composite pattern 
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		// --- Custom example hierarchical representations of Menu
		
		MenuComponent home = new Menu("Home", "/");
		
		MenuComponent products = new Menu("Products", "/all-products");		
		products.add(new MenuItem("Product-1", "/p1"));
		products.add(new MenuItem("Product-1", "/p1"));
		home.add(products);
		
		MenuComponent contact = new MenuItem("Contact", "/contact");
		home.add(contact);
		
		System.out.println(home.toString());
	}
}
