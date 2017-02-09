package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip buildingEnemyShip(String typeOfShip) {
        return null;
    }
}
