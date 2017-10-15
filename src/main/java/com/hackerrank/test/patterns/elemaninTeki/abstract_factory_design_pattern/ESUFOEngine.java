package com.hackerrank.test.patterns.elemaninTeki.abstract_factory_design_pattern;

/**
 * Created by jackalhan on 2/9/17.
 */
// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship
public class ESUFOEngine implements ESEngine {

    // EnemyShip contains a reference to the object
    // ESEngine. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOEngine is printed
    // the following shows on the screen

    public String toString() {
        return "1000 mph";
    }
}
