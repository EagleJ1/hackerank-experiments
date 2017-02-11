package com.hackerrank.test.patterns.command_design_pattern;

import java.util.List;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TurnAllElectronicsOffCommand implements Command {
    List<ElectronicDevice> electronicDevices;

    public TurnAllElectronicsOffCommand(List<ElectronicDevice> newDevices) {
        this.electronicDevices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.off();
        }

    }

    @Override
    public void undo() {
        for (ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.on();
        }
    }
}
