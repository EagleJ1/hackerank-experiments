package com.hackerrank.test.patterns.elemaninTeki.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// The concrete builder class that assembles the parts of the finished Robot object
// OldRobotBuilder (A.K.A)
public class RobotAssembler implements RobotBuilder {

    //COMPOSITIONAL TYPE OF WAY, STRATEGY PATTERN
    // Where the field is actually object
    private Robot robot;
    public RobotAssembler() {
        this.robot = new Robot();
    }


    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
