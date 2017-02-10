package com.hackerrank.test.patterns.decorator_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public abstract class ToppingDecorator implements Pizza {

    //COMPOSITION, field as an object
    protected Pizza tempPizza;
    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }
}
