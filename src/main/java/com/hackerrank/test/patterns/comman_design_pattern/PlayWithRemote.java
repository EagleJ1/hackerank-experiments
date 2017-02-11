package com.hackerrank.test.patterns.comman_design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackalhan on 2/10/17.
 */
public class PlayWithRemote {

    public static void main(String[] args) {
        // Gets the ElectronicDevice to use
        ElectronicDevice newTelevision = DeviceSelectorToBeManaged.getDevice();


        // TurnTVOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television
        TurnTVOnCommand onCommand = new TurnTVOnCommand(newTelevision);

        // Calling the execute() causes on() to execute in Television
        DeviceButton button = new DeviceButton(onCommand);

        // When press() is called theCommand.execute(); executes
        button.press();

        // ---------------------------------------------------------------

        TurnTVOffCommand offCommand = new TurnTVOffCommand(newTelevision);
        button = new DeviceButton(offCommand);
        button.press();

        // ---------------------------------------------------------------

        TvVolumeUpCommand tvVolumeUpCommand= new TvVolumeUpCommand(newTelevision);
        button = new DeviceButton(tvVolumeUpCommand);
        button.press();
        button.press();
        button.press();

        // ---------------------GOD BUTTON FOR TURNING ALL OF THE DEVICES OFF -------------------------

        TvVolumeDownCommand tvVolumeDownCommand= new TvVolumeDownCommand(newTelevision);
        button = new DeviceButton(tvVolumeDownCommand);
        button.press();

        // Let us look at if we have another device such as Radio, how the architecture will be
        Television tv = new Television();
        Radio radio = new Radio();
        List<ElectronicDevice> electronicDevices = new ArrayList<ElectronicDevice>();
        electronicDevices.add(tv);
        electronicDevices.add(radio);
        TurnAllElectronicsOffCommand turnAllElectronicsOffCommand = new TurnAllElectronicsOffCommand(electronicDevices);
        DeviceButton godButton = new DeviceButton(turnAllElectronicsOffCommand);
        //do
        godButton.press();
        //undo
        godButton.pressUndo();

    }
}