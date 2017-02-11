package com.hackerrank.test.patterns.proxy_design_pattern;

import com.hackerrank.test.patterns.proxy_design_pattern.ATMMachine;

/**
 * Created by jackalhan on 2/11/17.
 */
public class TestATMMachine {
    public static void main(String[] args) {

        /*
        * GetATMData realATMMachine = new ATMMachine();
        *
        * realATMMachine can not also access any methods of ATMMachine becase of restriction set by GetATMData proxy interface
        * */
        GetATMData atmProxy  = new ATMProxy();
        System.out.println("\nCurrent ATM State: " + atmProxy.getATMData());
        System.out.println("\nCash in ATM Machine : " + atmProxy.getCashInMachine());

    }
}
