package com.hackerrank.test.patterns.elemaninTeki.observer_pattern;

import java.util.ArrayList;

/**
 * Created by txcakaloglu on 2/9/17.
 */
/* ***********************/
/* OBSERVER PATTERNS    */
/* ***********************/
// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice, applePrice, googlePrice;

    public StockGrabber() {
        // Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        // Adds a new observer to the ArrayList
        observers.add(observer);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);
        // Print out message (Have to increment index to match)
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        // Removes observer from the ArrayList
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of price changes
        for (Observer observer : observers) {
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }
}
