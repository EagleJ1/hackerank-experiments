package com.hackerrank.test.patterns.elemaninTeki.adapter_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    //COMPOSITIONAL APPROACH AGAIN LIKE IN STRATEGY PATTERN
    EnemyRobotToBeAdapted robotAdaptee;

    public EnemyRobotAdapter(EnemyRobotToBeAdapted enemyRobotToBeAdapted) {
        this.robotAdaptee = enemyRobotToBeAdapted;
    }

    @Override
    public void fireWeapon() {
        robotAdaptee.smashWithHands();
    }

    @Override
    public void driveForward() {
        robotAdaptee.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        robotAdaptee.reactToHuman(driverName);
    }
}
