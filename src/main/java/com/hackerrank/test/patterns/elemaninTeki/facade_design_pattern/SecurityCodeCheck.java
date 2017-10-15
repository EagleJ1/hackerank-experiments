package com.hackerrank.test.patterns.elemaninTeki.facade_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class SecurityCodeCheck {

    private int securityCode = 1231;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {
        if (securityCode == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
