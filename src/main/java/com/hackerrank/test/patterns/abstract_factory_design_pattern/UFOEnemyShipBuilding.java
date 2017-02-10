package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    // If UFO was sent grab use the factory that knows
    // what types of weapons and engines a regular UFO
    // needs. The EnemyShip object is returned & given a name
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        EnemyShipFactory shipPartsFactory = null;
        if (typeOfShip.equals("U")) {
            shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }
        // If UFO BOSS was sent grab use the factory that knows
        // what types of weapons and engines a Boss UFO
        // needs. The EnemyShip object is returned & given a name
        else  if(typeOfShip.equals("B")) {
            shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
        }
        // We can add a new type of ship in this condition : For R - Rocket type ship,

            return theEnemyShip;

    }


}
