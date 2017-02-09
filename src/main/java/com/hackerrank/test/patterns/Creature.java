package com.hackerrank.test.patterns;

/**
 * Created by jackalhan on 2/8/17.
 */
public abstract class Creature {
    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setWeight(int weight);

    public abstract int geWeight();

    public abstract void setSound(String sound);

    public abstract String getSound();

}
