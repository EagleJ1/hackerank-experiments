package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class DVDRemote extends RemoteButton {

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        play = !play;
        System.out.println("DVD is Playing : " + play);
    }
}
