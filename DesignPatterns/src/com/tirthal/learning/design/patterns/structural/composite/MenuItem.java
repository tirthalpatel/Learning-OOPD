package com.tirthal.learning.design.patterns.structural.composite;

/**
 * An example of Leaf in composite pattern.
 * 
 * @author tirthalp
 *
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print(this);
	}
}
