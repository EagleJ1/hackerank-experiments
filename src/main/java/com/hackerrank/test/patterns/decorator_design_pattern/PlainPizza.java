package com.hackerrank.test.patterns.decorator_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
