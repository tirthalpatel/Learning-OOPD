package com.tirthal.learning.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * An example of Component in composite pattern.
 * 
 * @author tirthalp
 *
 */
public abstract class MenuComponent {
	
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String url;				
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	public MenuComponent add(MenuComponent menuComponent) {		
		throw new UnsupportedOperationException("This feature is not implemented at this level.");
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("This feature is not implemented at this level.");
	}
	
	public String print(MenuComponent menuComponent) {
		return new StringBuilder(name).append(" : ").append(url).append("\n").toString();
	}
}
