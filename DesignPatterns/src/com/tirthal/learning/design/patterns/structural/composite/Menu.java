package com.tirthal.learning.design.patterns.structural.composite;

import java.util.Iterator;

/**
 * An example of Composite in composite pattern.
 * 
 * @author tirthalp
 *
 */
public class Menu extends MenuComponent {	

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(print(this));

		Iterator<MenuComponent> itr = menuComponents.iterator();
		while (itr.hasNext()) {
			MenuComponent mc = itr.next();
			sb.append(mc.toString());
		}

		return sb.toString();
	}
}
