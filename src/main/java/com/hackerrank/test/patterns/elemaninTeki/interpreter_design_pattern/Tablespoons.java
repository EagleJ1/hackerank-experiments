package com.hackerrank.test.patterns.elemaninTeki.interpreter_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class Tablespoons extends Expression {
    @Override
    public String gallons(double quantity) {
        return Double.toString(quantity/256);

    }

    @Override
    public String quars(double quantity) {
        return Double.toString(quantity/64);

    }

    @Override
    public String pints(double quantity) {
        return Double.toString(quantity/32);

    }

    @Override
    public String cups(double quantity) {
        return Double.toString(quantity/16);

    }

    @Override
    public String tablespoons(double quantity) {
        return Double.toString(quantity);
    }
}
