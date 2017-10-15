package com.hackerrank.test.patterns.elemaninTeki.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// The director / engineer / provider class creates a Robot using the
// builder interface that is defined (RobotAssembler)
// A.K.A RobotEngineer
public class RobotDeliverer {

    private RobotBuilder robotBuilder;

    // RobotAssembler specification is sent to the engineer (provider who is designing the robot)
    public RobotDeliverer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }
    // return the Robot made from the RobotAssembler specs
    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    // execute the methods specific to the RobotBuilder
    // that implements RobotBuilder (RobotAssembler)
    public void deliverTheRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

}
