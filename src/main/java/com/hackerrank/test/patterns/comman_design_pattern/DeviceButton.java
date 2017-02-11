package com.hackerrank.test.patterns.comman_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
//Device needs buttons to execute each command
// this is the invoker class / object and knows nothing
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }
}
