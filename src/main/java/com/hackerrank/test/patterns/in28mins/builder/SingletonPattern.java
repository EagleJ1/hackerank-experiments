package com.hackerrank.test.patterns.in28mins.builder;

/**
 * Created by jackalhan on 10/14/17.
 */
public class SingletonPattern {

    private static SingletonPattern instance = null;

    protected SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

}
