package com.hackerrank.test.patterns.elemaninTeki.abstract_factory_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// Any part that implements the interface ESWeapon can replace that part in any ship
public interface ESWeapon {
    // User is forced to implement this method It outputs the string returned when the
    // object is printed
    String toString();

}
