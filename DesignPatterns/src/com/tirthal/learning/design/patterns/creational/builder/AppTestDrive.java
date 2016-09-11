package com.tirthal.learning.design.patterns.creational.builder;

/**
 * Client app accessing different implementations of builder pattern examples
 * 
 * @author tirthalp
 * 
 */
public class AppTestDrive {

	public static void main(String[] args) {
		
		// --- Real world example - Java StringBuilder
		StringBuilder sb = new StringBuilder().append("This is an example ")
											  .append("of the builder pattern. ");											  		
		sb.insert(sb.length(), "Awesome!");				
		System.out.println(sb.toString());
		System.out.println("-------------");

		// --- Custom builder example of Person		
		Person person = new Person.Builder().firstName("Tirthal")
											.lastName("Patel")
											.middleName("D")
											.salutation("Mr.")
											.age(30)
											.build();
		
		System.out.println(person.getFirstName());
		System.out.println(person);		
	}

}
