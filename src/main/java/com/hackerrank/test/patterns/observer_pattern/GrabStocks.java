package com.hackerrank.test.patterns.observer_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
/* ***********************/
/* OBSERVER PATTERNS    */
/* ***********************/
public class GrabStocks {
    public static void main(String[] args) {

        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();
        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.000);
        stockGrabber.setApplePrice(668.000);
        stockGrabber.setGooglePrice(669.000);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.000);
        stockGrabber.setApplePrice(668.000);
        stockGrabber.setGooglePrice(669.000);

        // Delete one of the observers
        stockGrabber.unregister(observer1);
        // It will not get updates from observer1 anymore
        stockGrabber.setIbmPrice(197.000);
        stockGrabber.setApplePrice(668.000);
        stockGrabber.setGooglePrice(669.000);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.000);
        Runnable getAPPLE= new GetTheStock(stockGrabber, 2, "APPLE", 668.000);
        Runnable getGOOGLE = new GetTheStock(stockGrabber, 2, "GOOGLE", 669.000);

        new Thread(getIBM).start();
        new Thread(getAPPLE).start();
        new Thread(getGOOGLE).start();
    }
}
