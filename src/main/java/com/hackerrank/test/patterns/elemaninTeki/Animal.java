package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Animal {

    private String name;
    private int weight;
    private String sound;
    private String food;
    private double speed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("Weight must be bigger than 0");
    }

    public int getWeight() {
        return weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setFavFood(String food) {
        this.food = food;
    }

    public String getFavFood() {
        return food;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }


    /* ***********************/
    /* STRATEGY PATTERNS    */
    /* ***********************/
    // Adding fly method directly in to the superclass is a bad method and strategy.
    // becuase it is bad idea to add a method into superclass that is not acceptable for all type of subclasses
    // although you can always override it under the subclasses but it is still not a perfect solution.
    /*
    public void fly(){
        System.out.println("I'm flying");
    }
    */
    /* Here is the advantage of STRATEGY PATTERM. You can check out the StrategyPatter_UML diagram.
    What STRATEGY PATTERN does is that defines a family of algorithms, encapsulate each one and make them interchangeable.
    In addition to this, it lets the algorithm vary independently from clients (sub or super classes)that uses it.
    So, let us look at how we are doing this;


    We are going to use FLY interface.
    Instead of using Interface in a traditional way, we use instance variable that is
    subclass of the FLIES interface and ANIMAL class does not care what FLYINGTPYE does.
    it just knows the bahavior is available to all of its subclasses. This is also known as COMPOSITION
    instead of inheriting, the class is composed with objects with the right ability build in.
    Another great thing about composition is allows you to change the capabilities of objects runtime
    if you create an animal object and it starts off as a non flying object but then it grows a set of wings
    and all of a suddent can fly dynamically. Like for example "Yes, I know this object did not fly before but
    it does.
    */

    public Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    //Setting FLYING_TYPE Behaviour
    public void setFlyingAbility(Flys flyingType) {
        this.flyingType = flyingType;
    }

}
