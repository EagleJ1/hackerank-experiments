package com.hackerrank.test.challenging;

/**
 * Created by jackalhan on 2/5/17.
 */
public class Method_Overriding_2 {

    static class BiCycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }

    static class MotorCycle extends BiCycle{
        String define_me(){
            return "a cycle with an engine.";
        }

        MotorCycle(){
            System.out.println("Hello I am a motorcycle, I am "+ define_me());
            String temp=super.define_me(); //Fix this line
            System.out.println("My ancestor is a cycle who is "+ temp );
        }

    }

}
