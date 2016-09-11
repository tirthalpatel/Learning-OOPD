package com.tirthal.learning.design.patterns.structural.bridge;

import java.util.List;

/**
 * An example of Refined abstraction 2 in bridge pattern
 * 
 * @author tirthalp
 *
 */
public class Bike extends Vehicle {

	public Bike(List<Workshop> workShops) {
		super(workShops);
	}

	@Override
	public String getVehicleType() {
		return "Bike ";
	}
}
