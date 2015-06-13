package com.tirthal.learning.design.patterns.behavioral.observer;

import java.util.ArrayList;

/**
 * Auctioner is implementation of Subject, and offers functionality to register observers, notify state updates to registered observers and unregister
 * observers.
 *
 * @author tirthalp
 *
 */
public class Auctioner implements Subject {
	private ArrayList<Observer> observers;
	private float bidPrice;

	public Auctioner() {
		observers = new ArrayList<Observer>();
	}

	// Register
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println("Registered: " + o.toString());
	}

	// Unregister
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
		System.out.println("Unregistered: " + o.toString());
	}

	// Notify state changes
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(bidPrice);
		}
	}

	private void bidPriceChanged() {
		notifyObservers();
	}

	public void setBidPrice(float bidPrice) {
		this.bidPrice = bidPrice;
		bidPriceChanged();
	}

	public float getBidPrice() {
		return bidPrice;
	}

}
