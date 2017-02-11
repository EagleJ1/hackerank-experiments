package com.hackerrank.test.patterns.comman_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class Radio implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio is ON");
    }

    @Override
    public void off() {

        System.out.println("Radio is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume is at " + volume);
    }
}
