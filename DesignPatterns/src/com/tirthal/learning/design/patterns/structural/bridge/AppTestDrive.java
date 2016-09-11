package com.tirthal.learning.design.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Client app for demo of bridge pattern 
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String[] args) {	

		// --- Custom example of bridge between Vehicle abstractions and Workshop concrete implementations
		
		List<Workshop> workshops = new ArrayList<>();
		workshops.add(new Produce());
		workshops.add(new Assemble());
		
		Vehicle vehicle1 = new Car(workshops);
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(workshops);
		vehicle2.manufacture();
		
		// How abstractions and implementations can be independently extensible? 
		// Try adding 'Truck extends Vehicle' or 'QualityAudit extends Workshop' independently.
	}

}
