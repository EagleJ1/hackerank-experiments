package com.hackerrank.test.patterns.elemaninTeki.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
public class TestRobotBuilder {
    public static void main(String[] args) {
        //get a robot builder of type robot assembler EVERYTING BASED ON THIS ASSEMBLER. CREATE ANOTHER TYPE OF ROBOT JUST CHANGING THIS.
        RobotBuilder robotAssembler = new RobotAssembler();

        //pass the old robot builder specification to the deliverer (engineer)
        RobotDeliverer robotDeliverer = new RobotDeliverer(robotAssembler);

        //tell the deliverer/engineer to make the Robot using the specifications of the RobotAssembler class
        robotDeliverer.deliverTheRobot();

        //the deliverer or engineer return the right Robot based on the spec sent to it on line 12.
        Robot firstRobot = robotDeliverer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type : " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type : " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type : " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type : " + firstRobot.getRobotLegs());
    }
}
