package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/8/17.
 */
public class WorkingWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);

        int randNum = 10;
        fido.changeVar(randNum);
        System.out.println("randNum after method call: " + randNum);

        changeObjectName(fido);
        System.out.println("Dog name after method call: " + fido.getName());

        /* **************/
        /* POLYMORPHISM */
        /* **************/
        Animal doggy = new Dog();
        Animal kitty = new Cat();
        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());
        Animal[] animals = new Animal[2];
        animals[0] = doggy;
        animals[1] = kitty;
        for (Animal animal : animals) {
            System.out.println("Animal is making a sound " + animal.getSound());
        }
        speakAnimal(doggy);
        //Since doggy is based on Animal class, it doest not have a digHole method.
        //Therefore doggy.digHole(); can not work for doggy.
        //However we can make it work by casting it to the dog class.
        ((Dog)doggy).digHole();

        /* ***********************/
        /* POWERING POLYMORPHISM */
        /* ***********************/
        // 1. Abstract Class
        // 2. Interface

        // Start With : 1) ABSTRACT CLASS
        // --------------------------------------
        // * There is no field that you can label with an an abstract keyword
        // * All methods of abstract class do not have to be abstract
        // * You can have static methods.
        // * You can have implementations in abstract class.
        // * You can not create an object or get an instance from the abstract class.
        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println("Giraffe name : " + giraffe.getName());

        // 2) INTERFACE CLASS
        // --------------------------------------
        // * Interface has only default abstract methods.
        // * You can implement as many interfaces as you want.
        // * You can only use publis static and final fields.
        // * Classes from different inheritance trees can use a common interface.





    }

    private static void speakAnimal(Animal randAnimal) {
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    //object is an instance of the class.
    // any method that are in a class however they are not tied to an object must be labelled as a static.
    // reference to the object
    public static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }
}
