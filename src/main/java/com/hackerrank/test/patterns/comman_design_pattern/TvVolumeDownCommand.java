package com.hackerrank.test.patterns.comman_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TvVolumeDownCommand implements Command {

    ElectronicDevice electronicDevice;

    public TvVolumeDownCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }

    @Override
    public void undo() {
        electronicDevice.volumeUp();
    }
}
