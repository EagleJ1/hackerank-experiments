package com.hackerrank.test.patterns.proxy_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */

// This interface will contain just those methods
// that you want the proxy to provide access to client

public interface GetATMData {

    ATMState getATMData();
    int getCashInMachine();

}
