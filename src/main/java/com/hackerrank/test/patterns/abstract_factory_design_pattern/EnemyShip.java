package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public abstract class EnemyShip {
    private String name;
    private double speed;
    private double damage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void displayEnemyShip()
    {
        System.out.println(getName() + " is created by the factory with following skills : ");
        displaySpeed();
        displayDamage();
    }

    private void displaySpeed(){
        System.out.println(" * Speed : " + getSpeed());
    }

    private void displayDamage(){
        System.out.println(" * Damage : " + getDamage());
    }
}
