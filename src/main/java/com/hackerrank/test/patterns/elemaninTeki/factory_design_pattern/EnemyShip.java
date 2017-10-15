package com.hackerrank.test.patterns.elemaninTeki.factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public abstract class EnemyShip {
    private String name;
    private double amountDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountDamage() {
        return amountDamage;
    }

    public void setAmountDamage(double damage) {
        this.amountDamage = damage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getAmountDamage());
    }



}
