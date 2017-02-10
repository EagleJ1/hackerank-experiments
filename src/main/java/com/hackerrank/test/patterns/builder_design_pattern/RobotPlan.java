package com.hackerrank.test.patterns.builder_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// This is the interface that will be returned from the builder
public interface RobotPlan {

    void setRobotHead(String head);

    void setRobotTorso(String torso);

    void setRobotArms(String arms);

    void setRobotLegs(String legs);
}
