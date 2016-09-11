package com.tirthal.learning.design.patterns.structural.bridge;

import java.util.List;

/**
 * An example of abstraction in bridge pattern
 * 
 * @author tirthalp
 *
 */
public abstract class Vehicle {
	protected List<Workshop> workshops;	

	protected Vehicle(List<Workshop> workshops) {
		this.workshops = workshops;		
	}
	
	public void manufacture() {
		System.out.print(getVehicleType());
		
		for(Workshop workshop : workshops) {
			workshop.work();
		}
	}
	
	abstract public String getVehicleType();
}
