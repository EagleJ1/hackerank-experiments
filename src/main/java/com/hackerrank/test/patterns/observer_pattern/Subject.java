package com.hackerrank.test.patterns.observer_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
/* ***********************/
/* OBSERVER PATTERNS    */
/* ***********************/
// This interface handles adding, deleting and updating all observers
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
