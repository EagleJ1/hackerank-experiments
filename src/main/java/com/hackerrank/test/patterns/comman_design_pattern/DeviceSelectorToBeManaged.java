package com.hackerrank.test.patterns.comman_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */

// return the type of device we are going to use.
public class DeviceSelectorToBeManaged {

    public static ElectronicDevice getDevice(){
        //we are going to use a television object here as a receiver to handle everything
        return new Television();
    }
}
