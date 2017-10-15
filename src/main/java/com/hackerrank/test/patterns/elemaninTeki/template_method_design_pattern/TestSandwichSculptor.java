package com.hackerrank.test.patterns.elemaninTeki.template_method_design_pattern;

/**
 * Created by jackalhan on 2/10/17.
 */
public class TestSandwichSculptor {
    public static void main(String[] args) {
        Hoagie cust1Hoagie = new ItalianHoagie();
        cust1Hoagie.makeSandwich();
        System.out.println();
        Hoagie cust2Hoagie = new VeggieHoagie();
        cust2Hoagie.makeSandwich();
    }
}
