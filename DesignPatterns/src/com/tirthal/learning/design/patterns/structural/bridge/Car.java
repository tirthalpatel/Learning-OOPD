package com.tirthal.learning.design.patterns.structural.bridge;

import java.util.List;

/**
 * An example of Refined abstraction 1 in bridge pattern
 * 
 * @author tirthalp
 *
 */
public class Car extends Vehicle {

	public Car(List<Workshop> workShops) {
		super(workShops);
	}

	@Override
	public String getVehicleType() {
		return "Car ";
	}
}
