package com.hackerrank.test.patterns.elemaninTeki.command_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TurnTVOffCommand implements Command {

    ElectronicDevice electronicDevice;

    public TurnTVOffCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    @Override
    public void undo() {
        electronicDevice.on();
    }
}
