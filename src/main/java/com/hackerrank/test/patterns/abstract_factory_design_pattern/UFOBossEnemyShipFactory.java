package com.hackerrank.test.patterns.abstract_factory_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
