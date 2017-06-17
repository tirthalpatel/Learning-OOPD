package com.tirthal.learning.oop.concepts;

//---------------------------------------
//--- STEP 00 - LEARN DESIGN PRINCIPLE TO DEFINE BEHAVIOR
//---------------------------------------

// To define behavior, always consider to use "delegation" over offer data access via getter/setter methods

//---------------------------------------
//--- STEP 01 - UNDERSTAND DELEGATION OVER GETTER/SETTER APPROACH BY EXAMPLE
//---------------------------------------

/**
 * 
 * 
 * @author tirthalp
 * @see Delegation_TestDrive
 */
public class Delegation_InsteadOfGetterSetter_TestDrive {

	public static void main(String[] args) {
		// -----------------------
		// --- STEP 03 - See why getter/setter are evil?
		// -----------------------
		Temperature1 temp1 = new Temperature1(100.0, TemperatureUnit.FAHRENHEIT);
		Temperature1 temp2 = new Temperature1(36.888, TemperatureUnit.CELSIUS);

		// Let's do something, if temp1 is higher than temp2
		double temp1InCelsius = ((temp1.getValue() - 32) * 5) / 9; // normalize to celsius
		double temp2InCelsius = temp2.getValue();

		if (temp1InCelsius > temp2InCelsius)
			System.out.println("Do some client specific operation...");

		/*
		 * What's problem?
		 * 
		 * Well, client code will become big and complex as need to add more functionality like adding Kelvin in
		 * TemperatureUnit.
		 * 
		 * Ideally, the Temperature1 class has the information, so it should be doing the comparison as per Delegation
		 * principle. So getting the temperature value and doing comparison outside of the Temperature1 class is not at
		 * all an acceptable solution.
		 */

		// -----------------------
		// --- STEP 04 - See how delegation helps to solve above problem and simply client code?
		// -----------------------
		Temperature2 temp3 = new Temperature2(100.0, TemperatureUnit.FAHRENHEIT);
		Temperature2 temp4 = new Temperature2(36.888, TemperatureUnit.CELSIUS);

		if (temp3.isGreaterThan(temp4))
			System.out.println("Do some client specific operation...");

		/*
		 * Awesome, this is greatly simplified client code.
		 * 
		 * Learning = Temperature2 class has data, client code should delegate temperature normalization and comparison
		 * responsibility to the Temperature2 class. Adding Kelvin support in TemperatureUnit would not impact client
		 * code anymore.
		 */
	}
}

// An enum of temperature units
enum TemperatureUnit {
	CELSIUS, FAHRENHEIT;
}

// A class with getter/setter
class Temperature1 {
	private double value;
	private TemperatureUnit unit;

	public Temperature1(double value, TemperatureUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public TemperatureUnit getUnit() {
		return unit;
	}

	public void setUnit(TemperatureUnit unit) {
		this.unit = unit;
	}
}

// A class having temperature comparison behavior, as it has data to do this job
class Temperature2 {
	private double value;
	private TemperatureUnit unit;

	public Temperature2(double value, TemperatureUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public boolean isGreaterThan(Temperature2 temp4) {
		return this.normalizedToCelsius() > temp4.normalizedToCelsius();
	}

	private double normalizedToCelsius() {
		return this.unit == TemperatureUnit.CELSIUS ? this.value : ((this.value - 32) * 5) / 9;
	}
}