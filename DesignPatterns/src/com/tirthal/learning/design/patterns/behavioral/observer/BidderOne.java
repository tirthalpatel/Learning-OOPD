package com.tirthal.learning.design.patterns.behavioral.observer;

/**
 * Bidder implementation of Observer type
 * 
 * @author tirthalp
 * 
 */
public class BidderOne implements Observer, DisplayElement {

	@Override
	public void update(float price) {
		// Bidder to propose new bid price in the auction
		float newPriceForBidding = Math.round(price + (Math.random() * 100) + (Math.random() * 100));
		display(newPriceForBidding);
	}

	@Override
	public void display(float proposedNewBid) {
		System.out.println("Bid of " + this.toString() + " " + proposedNewBid);
	}

	@Override
	public String toString() {
		return "Bidder-1";
	}
}
