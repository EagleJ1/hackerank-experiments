package com.hackerrank.test.patterns.elemaninTeki.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */

// The concrete Robot class based on the RobotPlan interface
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    public String getRobotHead(){
        return robotHead;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    public String getRobotTorso(){
        return robotTorso;
    }
    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    public String getRobotArms(){
        return robotArms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    public String getRobotLegs(){
        return robotLegs;
    }
}
