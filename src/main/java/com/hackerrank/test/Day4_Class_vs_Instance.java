package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/15/17.
 */
public class Day4_Class_vs_Instance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    static class Person {
        private int age;


        public Person(int initialAge) {
            if (initialAge < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0");
            } else {
                this.age = initialAge;
            }
        }

        public void yearPasses() {
            this.age =+ 1;
        }
        public void amIOld() {

            String msg = "";
            if (this.age < 13)
                msg = "You are young";
            else if ((this.age >= 13) && (this.age < 18))
                msg = "You are a teenager";
            else
                msg = "You are old";

            System.out.println(msg);
        }
    }
}


