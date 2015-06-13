package com.tirthal.learning.design.patterns.behavioral.observer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demo client which registers and unregister bidders (observers) with auctioner (subject) participate in the auction. If we see, client app is not
 * responsible to broadcast updates to all registered observers, rather it is accomplished through observer pattern.
 *
 * See implementation classes of Subject and Observer interfaces.
 *
 * @author tirthalp
 *
 */
public class AppTestDrive {

	public static void main(String[] args) {
		Auctioner auctioner = new Auctioner();
		Bidder b1 = new Bidder("Bidder One - Kat");
		Bidder b2 = new Bidder("Bidder Two - Ash");
		Bidder b3 = new Bidder("Bidder Three - Jade");

		// Register bidders
		System.out.println("------ Registering all bidders");
		auctioner.registerObserver(b1);
		auctioner.registerObserver(b2);
		auctioner.registerObserver(b3);

		// Auctioner to broadcast bid price
		System.out.println("------ Enter 'C' to close the bid.");
		Scanner scan = new Scanner(System.in);
		boolean isBidClosed = false;
		do {
			if (auctioner.getBidPrice() <= 0)
				System.out.print("Enter a starting bid price: ");
			else
				System.out.print("Enter a new highest bid price: ");

			try {
				auctioner.setBidPrice(scan.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("------ This bid is CLOSED now.");
				isBidClosed = true;
				scan.close();
			}
		} while (isBidClosed == false);

		// Unregister bidders
		System.out.println("------ Unregistering all bidders");
		auctioner.removeObserver(b1);
		auctioner.removeObserver(b2);
		auctioner.removeObserver(b3);
	}
}
