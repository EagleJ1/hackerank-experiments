package com.hackerrank.test.patterns.elemaninTeki.adapter_design_pattern;

import java.util.Random;

/**
 * Created by jackalhan on 2/10/17.
 */
public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();
    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1; //between 1 and 10
        System.out.println("Enemy Tank does " + attackDamage + " damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " distance");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");

    }
}
