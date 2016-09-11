package com.tirthal.learning.design.patterns.creational.builder;

/**
 * Example code snippet of builder pattern implementation - nested Person.Builder 
 * 
 * @author tirthalp
 */
public class Person {	
	
	// Nested Person.Builder
	
	public static class Builder {
		
		private String lastName;
		private String firstName;
		private String middleName;
		private String salutation;
		private int age;
		
		// Build immutable object
		public Person build() {
			return new Person(this);
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		public Builder salutation(String salutation) {
			this.salutation = salutation;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}		
	}
	
	// Person attributes, constructor and getter methods
	
	private final String lastName;
	private final String firstName;
	private final String middleName;
	private final String salutation;
	private final int age;
	
	// private constructor, because only internal builder needs to call me to provide my instance to clients
	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.middleName = builder.middleName;
		this.salutation = builder.salutation;
		this.age = builder.age;
	}
	
	// No setters, rather having only getters
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getSalutation() {
		return salutation;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((salutation == null) ? 0 : salutation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (salutation == null) {
			if (other.salutation != null)
				return false;
		} else if (!salutation.equals(other.salutation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", salutation=" + salutation + ", age=" + age + "]";
	}		
}
