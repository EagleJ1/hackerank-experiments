package com.hackerrank.test.patterns.elemaninTeki;

/**
 * Created by jackalhan on 2/9/17.
 */
/* ***********************/
/* STRATEGY PATTERNS    */
/* ***********************/
// ADVANTAGES
// -----------
// * to remove code duplication and manupalations
// * reduces long lists of conditionals (many many type of conditions, SP it helps)
// * Keeps class changes from forcing other class changes
// * Can hide complicated / secret code from the user
// DISADVANTAGE
// -----------
// * Increased Number of Objects / Classes
// ==========================================================================

/* We are going to use this interface inside of animal as an instance
*  variable and then we are going to dynamically change that instance varialbe to
*  be either of type class ITFLYS or CANTFLY.
*
*  Why is it a great idea?
*  Because inteface is implemented by many other different subclasses
*  and what this is going to allow us to do is create many different types of
*  flying WITHOUT AFFECTING ANIMAL or ANY OF THESE SUBCLASSES.
*  And classes that implement this new FLY interface are going to allow those
*  classes to use that code while also eliminating code duplication which means that
*  we are encapsulating the concept for the behaviour that varies and that behaviour concept
*  is capability to fly.
*
* */
public interface Flys {
    String fly();

}

class ItFlys implements Flys {

    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {

    @Override
    public String fly() {
        return "I can't fly";
    }
}

// I can even add more behaviour to this interface such as;
class ItFlysSuperFast implements Flys {

    @Override
    public String fly() {
        return "I am flying SUPER fast";
    }
}
