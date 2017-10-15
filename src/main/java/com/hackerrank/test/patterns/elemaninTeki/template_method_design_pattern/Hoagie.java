package com.hackerrank.test.patterns.elemaninTeki.template_method_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public abstract class Hoagie {

    final void makeSandwich() {
        cutBun();

        if (customerWantsMeat()) {
            addMeat();
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        if (customerWantsVegetables()) {
            addVegetables();
        }
        if (customerWantsCondiments()) {
            addCondiments();
        }

        wrapTheHoagie();
    }

    public void cutBun(){
        System.out.print("\nThe Hogie is Cut");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }


    public void wrapTheHoagie(){
        System.out.print("\nThe Hogie is Wrapped");
    }
}
