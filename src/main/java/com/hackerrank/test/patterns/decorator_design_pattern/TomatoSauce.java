package com.hackerrank.test.patterns.decorator_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return tempPizza.getCost() + .35;
    }


}
