package com.hackerrank.test.patterns.elemaninTeki.prototype_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class CloneFactory {
    // Receives any Animal, or Animal subclass and makes a copy of it and stores it in its own
    // location in memory

    // CloneFactory has no idea what these objects are except that they are subclasses of Animal

    public Animal getClone(Animal animalSample){
        // Because of Polymorphism the Sheeps makeCopy() is called here instead of Animals
        // any Animal.

        return animalSample.makeCopy();
    }

}
