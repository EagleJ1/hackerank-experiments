package com.hackerrank.test.patterns.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
// Refined Abstraction
// If I decide I want to further extend the remote I can

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
