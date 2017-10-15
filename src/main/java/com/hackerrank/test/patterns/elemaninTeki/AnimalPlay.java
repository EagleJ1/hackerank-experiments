package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/9/17.
 */
public class AnimalPlay {
    public static void main(String[] args) {

        /* ***********************/
        /* STRATEGY PATTERNS    */
        /* ***********************/
        // We are going to try what we have done for POLYMORPHICALLY in Animal, Dog, Bird classes and FLYS interface
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog : " + sparky.tryToFly());
        System.out.println("Bird : " + tweety.tryToFly());

        //Let us DYNAMICALLY set FLYING_ABILITY or behaviours of the animals.
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("After changed flying ability of Dog : " + sparky.tryToFly());
        tweety.setFlyingAbility(new ItFlysSuperFast());
        System.out.println("After changed flying ability of Bird : " + tweety.tryToFly());
    }
}
