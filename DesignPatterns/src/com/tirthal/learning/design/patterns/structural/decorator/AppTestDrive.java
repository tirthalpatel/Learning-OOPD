package com.tirthal.learning.design.patterns.structural.decorator;

/**
 * Client app for demo of decorator patter to prepare beverage with choice of condiments
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String args[]) {
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
