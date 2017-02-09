package com.hackerrank.test.patterns.observer_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
/* ***********************/
/* OBSERVER PATTERNS    */
/* ***********************/
// The Observers update method is called when the Subject changes
public interface Observer {
    void update(double ibmPrice, double applePrice, double googlePrice);
}
