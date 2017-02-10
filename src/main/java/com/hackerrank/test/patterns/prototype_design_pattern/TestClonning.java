package com.hackerrank.test.patterns.prototype_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TestClonning {
    public static void main(String[] args) {
        // Handles routing makeCopy method calls to the right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println("Sally Hashcode : " + System.identityHashCode(sally));
        System.out.println(clonedSheep);
        System.out.println("ClonedSheep Hashcode : " + System.identityHashCode(clonedSheep));
    }
}
