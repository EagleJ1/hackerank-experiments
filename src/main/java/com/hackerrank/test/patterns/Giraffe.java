package com.hackerrank.test.patterns;

/**
 * Created by jackalhan on 2/8/17.
 */
// Extends to Abstract Creature class
public class Giraffe extends Creature {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public int geWeight() {
        return 0;
    }

    @Override
    public void setSound(String sound) {

    }

    @Override
    public String getSound() {
        return null;
    }
}
