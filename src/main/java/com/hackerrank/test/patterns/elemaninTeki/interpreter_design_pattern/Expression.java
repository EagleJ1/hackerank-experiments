package com.hackerrank.test.patterns.elemaninTeki.interpreter_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public abstract class Expression {

    public abstract String gallons(double quantity);

    public abstract String quars(double quantity);

    public abstract String pints(double quantity);

    public abstract String cups(double quantity);

    public abstract String tablespoons(double quantity);
}
