package com.tirthal.learning.design.patterns.behavioral.observer;

/**
 * Subject interface
 * 
 * @author tirthalp
 * 
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
