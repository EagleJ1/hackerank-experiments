package com.hackerrank.test.patterns.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */

// Defines the methods needed for creating parts for the robot
public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();
}
