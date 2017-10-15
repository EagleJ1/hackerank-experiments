package com.hackerrank.test.patterns.elemaninTeki.bridge_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TVRemotePause extends RemoteButton {
    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");
    }
}
