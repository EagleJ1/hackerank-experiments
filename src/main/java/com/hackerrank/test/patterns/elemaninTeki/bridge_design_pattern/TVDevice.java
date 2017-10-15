package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */

// Concrete Implementor
// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSettings) {
        deviceState = newDeviceState;
        maxSettings = newMaxSettings;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }
}
