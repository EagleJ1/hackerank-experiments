package com.hackerrank.test.patterns.command_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TvVolumeUpCommand implements Command {

    ElectronicDevice electronicDevice;

    public TvVolumeUpCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }

    @Override
    public void undo() {
        electronicDevice.volumeDown();
    }
}
