package com.hackerrank.test.patterns.elemaninTeki.command_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
//Sub command which is implementing god Command interface
public class TurnTVOnCommand implements Command {

    //This command needs to know that which device it is going to work with.
    // Again COMPOSITION : Strategy Pattern
    ElectronicDevice electronicDevice;

    public TurnTVOnCommand(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        //since i am known as turn tv commands, i am calling the on method of this device.
        // which means that let me press the button of tvon at device.
        electronicDevice.on();

    }

    @Override
    public void undo() {
        electronicDevice.off();
    }
}
