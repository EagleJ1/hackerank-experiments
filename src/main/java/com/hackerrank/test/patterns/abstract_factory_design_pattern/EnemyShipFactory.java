package com.hackerrank.test.patterns.abstract_factory_design_pattern;


/**
 * Created by txcakaloglu on 2/9/17.
 */
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip enemyShip = null;
        if (enemyShip.equals("U"))
            enemyShip = new UFOEnemyShip();
        else if (enemyShip.equals("B"))
            enemyShip = new BigUFOEnemyShip();
        else if (enemyShip.equals("R"))
            enemyShip = new RocketEnemyShip();
        return enemyShip;
    }
}
