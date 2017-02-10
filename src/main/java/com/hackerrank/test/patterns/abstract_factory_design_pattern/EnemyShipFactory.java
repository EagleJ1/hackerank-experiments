package com.hackerrank.test.patterns.abstract_factory_design_pattern;


/**
 * Created by txcakaloglu on 2/9/17.
 */
// With an Abstract Factory Pattern you won't just build ships, but also all of the components
// for the ships
// Here is where you define the parts that are required if an object wants to be an enemy
public interface EnemyShipFactory {
    ESWeapon addESGun();
    ESEngine addESEngine();


}
