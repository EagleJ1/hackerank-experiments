package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
// Abstraction
// This is an abstract class that will represent numerous
// ways to work with each device

public abstract class RemoteButton {
    //COMPOSITION
    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice) {
        theDevice = newDevice;
    }

    // A reference to a generic device using aggregation
    // abstacting the methods that makes the differences
    //bridging
    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    //this is generic abstaction, so each type of devices need to implement it according to their usage.
    public abstract void buttonNinePressed();

}
