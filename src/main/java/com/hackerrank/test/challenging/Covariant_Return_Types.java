package com.hackerrank.test.challenging;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Covariant_Return_Types {

    //Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.

    static class State {
        public State() {
        }

        public Flower yourNationalFlower()
        {
            return new Flower();
        }
    }

    static class WestBengal extends State{
        public WestBengal() {
        }

        @Override
        public Jasmine yourNationalFlower()
        {
            return new Jasmine();
        }
    }
    static class Karnataka extends State{
        public Karnataka() {
        }

        @Override
        public Lotus yourNationalFlower()
        {
            return new Lotus();
        }
    }

    static class AndhraPradesh extends State{
        public AndhraPradesh() {
        }

        @Override
        public Lily yourNationalFlower()
        {
            return new Lily();
        }
    }

    static class Flower {
        public Flower() {
        }

        public String whatsYourName()
        {
            return "I have many names and types";
        }
    }

    static class Jasmine extends Flower
    {
        public Jasmine(){

        }

        @Override
        public String whatsYourName() {
            return "Jasmine";
        }
    }

    static class Lily extends Flower
    {
        public Lily(){

        }

        @Override
        public String whatsYourName() {
            return "Lily";
        }
    }

    static class Lotus extends Flower
    {
        public Lotus(){

        }

        @Override
        public String whatsYourName() {
            return "Lotus";
        }
    }
}
