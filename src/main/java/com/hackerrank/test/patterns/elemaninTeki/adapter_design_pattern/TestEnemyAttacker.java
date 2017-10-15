package com.hackerrank.test.patterns.elemaninTeki.adapter_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TestEnemyAttacker {

    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobotToBeAdapted robot = new EnemyRobotToBeAdapted();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        System.out.println("The Robot");
        robot.reactToHuman("Paul");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("The Enemy Tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();


        // Therefore, although calling adapter methods, we can still call original methods of Robot.
        // Our adapter is working perfectly fine.
        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }

}
