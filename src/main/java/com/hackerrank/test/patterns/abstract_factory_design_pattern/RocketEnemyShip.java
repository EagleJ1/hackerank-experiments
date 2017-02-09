package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public class RocketEnemyShip extends EnemyShip {
    public RocketEnemyShip() {
        setName("Rocket Enemy Ship");
        setDamage(10.0);
        setSpeed(50.0);
    }
}
