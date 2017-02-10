package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// This factory uses the EnemyShipFactory interface to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship will use by defining the methods implemented
// being ESWeapon and ESEngine. The returned object specifies a specific weapon & engine
public class UFOEnemyShipFactory implements EnemyShipFactory {
    // Defines the weapon object to associate with the ship
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    // Defines the engine object to associate with the ship
    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
