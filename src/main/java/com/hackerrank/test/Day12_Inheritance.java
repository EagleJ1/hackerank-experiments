package com.hackerrank.test;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Day12_Inheritance {

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
            calculate();
        }

        char calculate() {
            char grade = ' ';
            int sum = 0;
            for (int i = 0; i < testScores.length; i++) {
                sum = sum + testScores[i];
            }
            double average = sum / testScores.length;
            if (average >= 90 && average <= 100)
                grade = 'O';
            else if (average >= 80 && average < 90)
                grade = 'E';
            else if (average >= 70 && average < 80)
                grade = 'A';
            else if (average >= 55 && average < 70)
                grade = 'P';
            else if (average >= 40 && average < 55)
                grade = 'D';
            else
                grade = 'T';
            return grade;

        }
    }


}
