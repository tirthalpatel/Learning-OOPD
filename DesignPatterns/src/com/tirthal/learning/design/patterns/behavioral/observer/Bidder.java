package com.tirthal.learning.design.patterns.behavioral.observer;

/**
 * Bidder implementation of Observer type
 *
 * @author tirthalp
 *
 */
public class Bidder implements Observer, DisplayElement {

	private String name;

	public Bidder(String name) {
		this.name = name;
	}

	@Override
	public void update(float price) {
		// Bidder to propose new bid price in the auction
		float newPriceForBidding = Math.round(price + (Math.random() * 100) + (Math.random() * 100));
		display(newPriceForBidding);
	}

	@Override
	public void display(float proposedNewBid) {
		System.out.println("Bid of " + this.toString() + " - " + proposedNewBid);
	}

	@Override
	public String toString() {
		return name;
	}
}
