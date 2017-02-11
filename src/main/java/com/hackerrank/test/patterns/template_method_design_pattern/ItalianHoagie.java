package com.hackerrank.test.patterns.template_method_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class ItalianHoagie extends Hoagie {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    @Override
    void addMeat() {
        System.out.print("\nAdding the Meat: ");
        for (String meat : meatUsed) {
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.print("\nAdding the Cheese: ");
        for (String cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
    }

    @Override
    void addVegetables() {
        System.out.print("\nAdding the Vegetables: ");
        for (String vegi : veggiesUsed) {
            System.out.print(vegi + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("\nAdding the Condiments: ");
        for (String condiment : condimentsUsed) {
            System.out.print(condiment + " ");
        }
    }
}
