package com.hackerrank.test.patterns.elemaninTeki.adapter_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public interface EnemyAttacker {

    // this is what the clients expects to be working with
    //  adapter job to make new classes compatible with this interface

    void fireWeapon();
    void driveForward();
    void assignDriver(String driverName);

}
