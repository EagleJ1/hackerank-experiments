package com.hackerrank.test.challenging;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Singleton_Pattern {

    public String str;
    private Singleton_Pattern singleton_pattern = null;

    private Singleton_Pattern() {

    }

    public Singleton_Pattern getSingleInstance() {
        if (singleton_pattern == null) {
            singleton_pattern = new Singleton_Pattern();
        }
        return singleton_pattern;

    }
}
