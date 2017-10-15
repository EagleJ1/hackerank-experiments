package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
// Concrete Implementor
public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceStat, int newMaxSetting) {
        deviceState = newDeviceStat;
        maxSettings = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("DVD Skips to previous Chapter");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("DVD Skips to next Chapter");
        deviceState++;
    }
}
