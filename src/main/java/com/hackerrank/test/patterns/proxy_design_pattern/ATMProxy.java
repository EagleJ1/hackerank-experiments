package com.hackerrank.test.patterns.proxy_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */

// In this situation the proxy both creates and destroys
// an ATMMachine Object
public class ATMProxy implements GetATMData {

    // Allows the user to access getATMState in the
    // Object ATMMachine
    @Override
    public ATMState getATMData() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMData();
    }
    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    @Override
    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
