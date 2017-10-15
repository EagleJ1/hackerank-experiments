package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
// Implementor
// With the Bridge Design Pattern you create 2 layers of abstraction
// In this example I'll have an abstract class representing
// different types of devices. I also have an abstract class
// that will represent different types of remote controls

// This allows me to use an infinite variety of devices and remotes

public abstract class EntertainmentDevice {

    // current channel device is on or current chapter for using a DVD
    public int deviceState;

    // max channel number possible or the max chapter for dvd
    public int maxSettings;

    public int volumeLevel= 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback() {
        if (deviceState > maxSettings || deviceState < 0) {
            deviceState = 0;
        }

        System.out.println("On Channel " + deviceState);
    }

    public void buttonSevenPressed(){
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonEightPressed(){
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }

}
