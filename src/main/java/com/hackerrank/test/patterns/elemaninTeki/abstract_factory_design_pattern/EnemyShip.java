package com.hackerrank.test.patterns.elemaninTeki.abstract_factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public abstract class EnemyShip {

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts
    // in UFOEnemyShipFactory or UFOBossEnemyShipFactory
    private String name;

    ESWeapon weapon;
    ESEngine engine;
    ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void makeShip();

    // Because I defined the toString method in engine
    // when it is printed the String defined in toString goes
    // on the screen

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero at " + engine);
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }

    // If any EnemyShip object is printed to screen this shows up
    public String toString() {
        String infoOnShip = "The " + getName() + " has a top speed of " + engine +
                " and an attack power of " + weapon;
        return infoOnShip;
    }
}
