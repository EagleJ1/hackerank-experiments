package com.hackerrank.test.patterns.factory_design_pattern;

/**
 * Created by txcakaloglu on 2/9/17.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        //This is the place where we are encapsulating everything.
        //If need to change anything, we can just do over here, this is the principle of ENCAPSULATION

        EnemyShip newShip = null;
        if (newShipType.equals("U")) {
            newShip = new UFOEnemyShip();
        } else if (newShipType.equals("R")) {
            newShip = new RocketEnemyShip();
        } else if (newShipType.equals("B")) {
            newShip = new BigUFOEnemyShip();
        }
        return newShip;
    }
}
