package com.hackerrank.test.patterns.template_method_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }


    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
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
