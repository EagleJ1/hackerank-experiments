package com.hackerrank.test.patterns.elemaninTeki.decorator_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients : " + basicPizza.getDescription());
        System.out.println("Price : " + basicPizza.getCost());
    }
}
